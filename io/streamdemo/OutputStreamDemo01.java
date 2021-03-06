import java.io.File;
import java.io.OutputStream;
import java.io.FileOutputStream;
public class OutputStreamDemo01{
	public static void main(String[] args) throws Exception{
		//第一步使用File类找到文件
		File f = new File(File.separator + "home" + File.separator + 
				"qingliu" + File.separator + "test.txt");
		//第二步，通过子类实例化父类对象
		OutputStream out = null;             //准备好一个输出对象
		out = new FileOutputStream(f);       //通过对象多态性进行实例化
		//第三步，进行写操作
		String str = "Hello World!";         //准备一个字符串   
		byte b[] = str.getBytes(); 			 //只能输出byte数组，所以将字符串转化为byte数组
		out.write(b);                        //将内容输出保存文件
		//第四步，关闭流
		out.close();
	}
}