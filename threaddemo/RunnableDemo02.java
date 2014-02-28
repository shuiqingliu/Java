class MyThread implements Runnable{
	private int ticket = 15;
	public void run(){
		for(int i = 0;i<100;i++){
			if(this.ticket > 0){
				System.out.println("买票:" + ticket--);
			}
		}
	}
}
public class RunnableDemo02{
	public static void main(String[] args){
		MyThread mt1 = new MyThread();
		new Thread(mt1).run();
		new Thread(mt1).run();
		new Thread(mt1).run();
	}
}