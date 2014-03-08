class MyThead implements Runnable{
	private boolean flag = true;
	public void run(){
		int i = 0;
		while(this.flag){
			System.out.println(Thread.currentThread().getName() + "运行,i = " + (i++));
		}
	}
	public void stop(){
		this.flag = false;
	}
}
public class StopDemo{
	public static void main(String[] args) {
		MyThead my = new MyThead();
		Thread t1 = new Thread(my,"线程");
		t1.start();
		try{
			Thread.sleep(40);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		my.stop();
	}
}