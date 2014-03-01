class MyThread implements Runnable{
	public void run(){
		for(int i = 0;i < 3;i++){
			System.out.println(Thread.currentThread().getName() + "运行, i = " + i);
		}
	}
}
public class ThreadNameDemo{
	public static void main(String[] args){
		MyThread mt = new MyThread();
		new Thread(mt).start();
		new Thread(mt,"线程-A").start();
		new Thread(mt,"线程-B").start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}