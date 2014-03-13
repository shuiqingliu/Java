public class StringBuffer05{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World");
		buf.replace(6,11,"Qingliu");
		System.out.println(buf);
	}
} 