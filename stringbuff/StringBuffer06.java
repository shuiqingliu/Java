public class StringBuffer06{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World");
		buf.replace(6,11,"Qingliu");
		String str = buf.substring(6,13);
		System.out.println(str);
	}
} 