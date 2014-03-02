class TheThread implements Runnable{
	private String name;
	private int time;
	public TheThread(String name,int time){
		this.name = name;
		this.time = time;
	}
	public void run(){
		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(this.name + "线程,休眠" + this.time +"毫秒");
	}
}
public class ExecDemo02{
	public static void main(String[] args){
		TheThread mt1 = new TheThread("线程A", 1000);
		TheThread mt2 = new TheThread("线程B", 2000);
		TheThread mt3 = new TheThread("线程C", 3000);
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}
}
