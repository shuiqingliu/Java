class MyThread implements Runnable{
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		for(int i=1;i < 10;i++){
			System.out.println(Thread.currentThread().getName() +"运行,i =" + i);
			if(i ==3){
				System.out.print("线程礼让");
				Thread.currentThread().yield();
			}
		}
	}
}
public class ThreadYieldDemo{
	public static void main(String[] args){
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"线程A");
		Thread t2 = new Thread(my,"线程B");
		t1.start();
		t2.start();
	}
}