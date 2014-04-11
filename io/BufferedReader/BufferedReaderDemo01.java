import java.io.*;
public class BufferedReaderDemo01{
	public static void main(String[] args){
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.print("请输入信息:");
		try{
			str = buf.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("输入的内容为：" + str);
	}
}