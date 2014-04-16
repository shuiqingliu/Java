import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
public class SerDemo02{
	public static void main(String[] args) throws Exception{
		File f = new File("d:" + File.separator + "test.txt");		//定义保存路径
		ObjectInputStream ois = null;		//声明对象输入流
		InputStream input = new FileInputStream(f);		//实例化文件输入流
		ois = new ObjectInputStream(input);		//实例化对象输入流		
		Object obj = ois.readObject();		//读取对象
		ois.close();		//关闭
		System.out.println(obj);
	}
}