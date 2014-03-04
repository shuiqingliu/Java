class TwoThread implements Runnable{
	private int ticket = 5;
	public void run(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for (int i = 0; i < 1000; i++) {
			if(ticket > 0){				
				System.out.println("卖票：" + ticket--);
			}
		}
	}
}
public class SynDemo02{
	public static void main(String[] args) {
		TwoThread one = new TwoThread();
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(one);
		Thread t3 = new Thread(one);
		t1.start();
		t2.start();
		t3.start();
	}
}