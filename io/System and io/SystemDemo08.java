import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class SystemDemo08{
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("d:" + File.separator + "err.log"));
		InputStream input = System.in;
		byte b[] = new byte[1024];
		int len = input.read(b);
		System.out.println("输入内容为:" + new String(b,0,len));
		input.close();
	}
}