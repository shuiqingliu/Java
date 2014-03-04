class OneThread implements Runnable{
	private int ticket = 5;
	public void run(){
		for (int i = 0; i < 1000; i++) {
			if(ticket > 0){
				System.out.println("卖票：" + ticket--);
			}
		}
	}
}
public class SynDemo01{
	public static void main(String[] args) {
		OneThread one = new OneThread();
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(one);
		Thread t3 = new Thread(one);
		t1.start();
		t2.start();
		t3.start();
	}
}