import java.io.File;
import java.io.Writer;
import java.io.FileWriter;
public class WriterDemo03{
	public static void main(String[] args) throws Exception{
		//第一步使用File类找到文件
		File f = new File(File.separator + "home" + File.separator + 
				"qingliu" + File.separator + "test.txt");
		//第二步，通过子类实例化父类对象
		Writer out = null;             //准备好一个输出对象
		out = new FileWriter(f);       //通过对象多态性进行实例化
		//第三步，进行写操作
		String str = "Hello World!!!";
		out.write(str);
		//第四步，关闭流
		out.flush();
		//out.close();  //此时没有关闭字符流，缓冲区未刷新将不输出文件
	}
}