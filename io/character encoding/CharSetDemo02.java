import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class CharSetDemo02{
	public static void main(String[] args) throws Exception{
		/*实例化File类*/
		File f = new File("d:" + File.separator + "test.txt");
		OutputStream out = new FileOutputStream(f);			//实例化输出流
		byte b[] = "你好,我叫xxx".getBytes("ISO8859-1");		//转码操作
		out.write(b);		//保存
		out.close();		//关闭
	}
}