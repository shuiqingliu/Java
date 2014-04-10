import java.io.InputStream;
public class SystemDemo03{
	public static void main(String[] args) throws Exception{
		InputStream input = System.in;  //从键盘读取输入
		byte b[] = new byte[1024];
		System.out.print("请输入数据:");
		int len = input.read(b);
		System.out.println("输入的内容为:" + new String(b,0,len));
		input.close();
	}
}