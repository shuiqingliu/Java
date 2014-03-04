class TwoThread implements Runnable{
	private int ticket = 5;
	public void run(){
		for (int i = 0; i < 1000; i++) {
			if(ticket > 0){
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("卖票：" + ticket--);
			}
		}
	}
}
public class SynDemo02{
	public static void main(String[] args) {
		TwoThread m = new TwoThread();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		t1.start();
		t2.start();
		t3.start();
	}
}