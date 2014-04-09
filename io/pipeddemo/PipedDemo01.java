import java.io.*;
class Send implements Runnable{
	private PipedOutputStream pos = null;
	public Send(){
		this.pos = new PipedOutputStream();
	}
	public void run(){
		String str = "HELLO Wrold";
		try{
			this.pos.write(str.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			this.pos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public PipedOutputStream getPos(){
		return this.pos;
	}	
}
class Recive implements Runnable{
	private PipedInputStream pis = null;
	public Recive(){
		this.pis = new PipedInputStream();
	}
	public void run(){
		byte b[]= new byte[1024];
		int len = 0;
		try{
			len = this.pis.read(b);
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			this.pis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("读到的内容为" + new String(b,0,len));
	}
	public PipedInputStream getPis(){
		return this.pis;
	}
}
public class PipedDemo01{
	public static void main(String[] args){
		Send s = new Send();
		Recive r = new Recive();
		try{
			s.getPos().connect(r.getPis());
		}catch(IOException e){
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}