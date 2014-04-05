import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
public class InputStreamDemo03{
	public static void main(String[] args) throws Exception{
		//第一步使用File类找到文件
		File f = new File(File.separator + "home" + File.separator + 
				"qingliu" + File.separator + "test.txt");
		//第二步，通过子类实例化父类对象
		InputStream input = null;             //准备好一个输出对象
		input = new FileInputStream(f);       //通过对象多态性进行实例化
		//第三步，进行读操作
		byte b[] = new byte[(int)f.length()]; 			 //所有内容读到此数组,数组大小由文件决定
		input.read(b);	                     //读取内容
		//第四步，关闭流
		input.close();
		System.out.println("字符串为：" + new String(b));  //将字节转化为字符串
	}
}