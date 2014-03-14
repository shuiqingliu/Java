public class RuntimeDemo01{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM最大内存:" + rt.maxMemory());
		System.out.println("JVM空闲内存:" + rt.freeMemory());
	}
}