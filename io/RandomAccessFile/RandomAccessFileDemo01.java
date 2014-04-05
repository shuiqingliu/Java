import java.io.File;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo01{
	public static void main(String[] args) throws Exception{
		File f = new File("d:" + File.separator + "test.txt"); //指向要操作的文件
		RandomAccessFile rdf = null;      //声明RandomAccessFile类的对象
		rdf = new RandomAccessFile(f,"rw"); //读写模式如果文件不存在则创建文件
		String name = null;
		int age = 0;
		name = "zhangsan";    //字符串长度为8
		age = 30;             //数字床都为4  
		rdf.writeBytes(name); //将姓名写入文件之中
		rdf.writeInt(age);   //将年龄写入文件中
		name = "lisi    ";    //字符串长度为8
		age = 31;             //数字床都为4  
		rdf.writeBytes(name); //将姓名写入文件之中
		rdf.writeInt(age);   //将年龄写入文件中
		name = "wangwu   ";    //字符串长度为8
		age = 32;             //数字床都为4  
		rdf.writeBytes(name); //将姓名写入文件之中
		rdf.writeInt(age);   //将年龄写入文件中
		rdf.close();         //关闭
	}
}