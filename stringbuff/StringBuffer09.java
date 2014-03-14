public class StringBuffer09{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer();
		buf.append("qingliu");
		for(int i = 0;i < 100;i++){
			buf.append(i);
		}
		System.out.println(buf);
	}
} 