public class RuntimeDemo02{
	public static void main(String[] args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM最大内存:" + rt.maxMemory());
		System.out.println("JVM空闲内存:" + rt.freeMemory());
		String str = "Hello" + "World" + "1111" + "\t" + "qingliu" + "...";
		for(int x = 0;x<1000;x++){
			str += x;
		}
		System.out.println("垃圾收理之前" + rt.freeMemory());
		rt.gc();
		System.out.println("垃圾收理之后" + rt.freeMemory());
	}
}