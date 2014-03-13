public class StringBuffer07{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World");
		buf.replace(6,11,"Qingliu");
		String str = buf.delete(6,13 ).toString();
		System.out.println(str);
	}
} 