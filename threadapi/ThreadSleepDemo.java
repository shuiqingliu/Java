class MyThread implements Runnable{
	public void run(){
		for(int i = 0;i < 50;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){

			}
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
		}
	}
}
public class ThreadSleepDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		t.start();
	}
}