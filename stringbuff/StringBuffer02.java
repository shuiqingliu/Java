public class StringBuffer02{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		fun(buf);
		System.out.println(buf);
	}
	public static void fun(StringBuffer s){
			s.append("qingliu").append("javaer");
		}
}