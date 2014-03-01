class MyThread implements Runnable{
	public void run(){
		for(int i = 0;i < 3;i++){
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
		}
	}
}
public class ThreadAliveDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		Thread t = new Thread(mt,"线程");
		System.out.println("线程开始执行之前=========>" + t.isAlive());
		System.out.println("线程开始执行之前=========>" + t.isAlive());
		t.start();
		for(int x =0;x < 3;x++){
			System.out.println("main 运行" + x);
		}
		System.out.println("线程开始之后=========>" + t.isAlive());
	}
}