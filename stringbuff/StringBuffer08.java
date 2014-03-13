public class StringBuffer08{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("Hello ").append("World");
		if(buf.indexOf("Hello") == -1){
			System.out.println("未找到查找内容");
		}else{
			System.out.println("已经查找到Hello");
		}
	}
} 