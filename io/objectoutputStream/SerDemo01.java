import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
public class SerDemo01{
	public static void main(String[] args) throws Exception{
		File f = new File("d:" + File.separator + "test.txt");		//定义保存路径
		ObjectOutputStream oos = null;		//声明对象输出流
		OutputStream out = new FileOutputStream(f);		//实例化文件输出流
		oos = new ObjectOutputStream(out);		//实例化对象输出流		
		oos.writeObject(new Person("张三",28));		//写入数据
		oos.close();		//关闭对象输出流
	}
}