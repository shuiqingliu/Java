public class StringBuffer03{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.insert(0,"oh");
		System.out.println(buf);
	}
}