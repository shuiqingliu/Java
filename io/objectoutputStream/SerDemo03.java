import java.io.*;
public class SerDemo03{
	public static void main(String[] args) throws Exception{
		dser();
	}
	public static void ser() throws Exception{
		File f = new File("d:" + File.separator + "test.txt");		//定义保存路径
		ObjectOutputStream oos = null;		//声明对象输出流
		OutputStream out = new FileOutputStream(f);		//实例化文件输出流
		oos = new ObjectOutputStream(out);		//实例化对象输出流		
		oos.writeObject(new Person("张三",28));		//写入数据
		oos.close();		//关闭对象输出流
	}
	public static void dser() throws Exception{
		File f = new File("d:" + File.separator + "test.txt");		//定义保存路径
		ObjectInputStream ois = null;		//声明对象输入流
		InputStream input = new FileInputStream(f);		//实例化文件输入流
		ois = new ObjectInputStream(input);		//实例化对象输入流		
		Object obj = ois.readObject();		//读取对象
		ois.close();		//关闭
		System.out.println(obj);
	}
}