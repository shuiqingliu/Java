public class StringBuffer01{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("hello");
		buf.append("world").append(1).append("!!!");
		buf.append("\n");
		buf.append("数字 = ").append(34).append("\n");
		buf.append("字符 = ").append('C').append("\n");
		buf.append("字符 = ").append('C').append("\n");
		buf.append("布尔值 = ").append(true);
		System.out.println(buf);
	}
}