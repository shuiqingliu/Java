class MyThread implements Runnable{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println(name + "运行, i =" + i);
		}
	}
}
public class RunnableDemo01{
	public static void main(String[] args){
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		Thread th1 = new Thread(mt1);
		Thread th2 = new Thread(mt2);
		th1.start();
		th2.start();
	}
}