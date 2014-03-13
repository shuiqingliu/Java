public class StringBuffer04{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		String str = buf.reverse().toString();
		System.out.println(str);
	}
} 