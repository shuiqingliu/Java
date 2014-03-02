class MyThread implements Runnable{
	private String name;
	private int time;
	public MyThread(String name,int time){
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
		MyThread mt1 = new MyThread("线程A", 1000);
		MyThread mt2 = new MyThread("线程B", 2000);
		MyThread mt3 = new MyThread("线程C", 3000);
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}
}
