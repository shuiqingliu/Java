public class MainPriority{
	public static void main(String[] args){
		System.out.println("主方法的进程优先级:" + Thread.currentThread().getPriority());
		System.out.println("MAX_PRIORITY =" + Thread.MAX_PRIORITY);
		System.out.println("MIN_PRIORITY =" + Thread.MIN_PRIORITY);
		System.out.println("NORM_PRIORITY =" + Thread.NORM_PRIORITY);
	}
}