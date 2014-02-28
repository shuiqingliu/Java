class MyThread extends Thread{
	private int ticket = 15;
	public void run(){
		for(int i = 0;i<100;i++){
			System.out.println("买票:" + ticket--);
		}
	}
}
public class ThreadDemo04{
	public static void main(String[] args){
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		mt1.run();
		mt2.run();
		mt3.run();
	}
}