class Zhangsan{
	public void say(){
		System.out.println("张三对李四说：”你给我画，我就给你书“");
	}
	public void get(){
		System.out.println("张三得到画了");
	}
}
class Lisi{
	public void say(){
		System.out.println("李四对张三说：“你给我书，我就给你画”");
	}
	public void get(){
		System.out.println("李四得到书了");
	}
}
public class ThreadDeadLock implements Runnable{
	private static Zhangsan zhangsan = new Zhangsan();
	private static Lisi li = new Lisi();
	private boolean flag = false;
	public void run(){
		if(flag){
			synchronized(zhangsan){
				zhangsan.say();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized(li){
					zhangsan.get();
				}
			}
		}else{
			synchronized (li) {
				li.say();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				synchronized(zhangsan){
					li.get();
				}
			}
		}
	}
	public static void main(String[] args){
		ThreadDeadLock th1 = new ThreadDeadLock();
		ThreadDeadLock th2 = new ThreadDeadLock();
		th1.flag = true;
		th2.flag = false;
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t2.start();
	}
}
