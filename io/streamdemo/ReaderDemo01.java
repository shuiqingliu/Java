import java.io.File;
import java.io.Reader;
import java.io.FileReader;
public class ReaderDemo01{
	public static void main(String[] args) throws Exception{
		//第一步使用File类找到文件
		File f = new File(File.separator + "home" + File.separator + 
				"qingliu" + File.separator + "test.txt");
		//第二步，通过子类实例化父类对象
		Reader input = null;             //准备好一个输出对象
		input = new FileReader(f);       //通过对象多态性进行实例化
		//第三步，进行读操作
		char c[] = new char[1024];
		int len = input.read(c);
		//第四步，关闭流
		input.close();
		System.out.println("读取到的字符串为：" + new String(c,0,len));
	}
}