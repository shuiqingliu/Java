import java.io.*;
public class IODemo01{
	public static void main(String[] args) throws Exception{
		int i = 0;
		int j = 0;
		BufferedReader buf = null;
		buf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		System.out.print("请输入第一个数：");
		str = buf.readLine();
		i = Integer.parseInt(str);
		System.out.print("请输入第二个数：");
		str = buf.readLine();
		j = Integer.parseInt(str);
		System.out.println(i + "+" + j + "=" + (i+j));
	}
}