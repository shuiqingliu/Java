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
		OneThread one1 = new OneThread();
		OneThread one2 = new OneThread();
		OneThread one3 = new OneThread();
		new Thread(one1).start();
		new Thread(one2).start();
		new Thread(one3).start();
	}
}