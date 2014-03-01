class MyThread implements Runnable{
	public void run(){
		System.out.println("1.进入run()方法");
		try{
			Thread.sleep(2000);
			System.out.println("2.休眠完成");
		}catch(InterruptedException e){
			System.out.println("3.线程被终止111");
			return;
		}
		System.out.println("4.run()方法执行完成");
	}
}
public class ThreadInterruptDemo01{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		t.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("3.线程被终止");
		}
		t.interrupt();
	}
}