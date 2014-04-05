import java.io.File;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo03{
	public static void main(String[] args) throws Exception{
		File f = new File("d:" + File.separator + "test.txt"); //指向要操作的文件
		RandomAccessFile rdf = null;      //声明RandomAccessFile类的对象
		rdf = new RandomAccessFile(f,"r"); //只读模式如果文件不存在则创建文件
		String name = null;
		int age = 0;
		byte b[] = new byte[8];
		rdf.skipBytes(12);
		for(int i = 0;i<b.length;i++){
			b[i] = rdf.readByte();
		}
		name = new String(b);
		age = rdf.readInt();
		System.out.println("第二个人的信息----->姓名:" + name + "年龄:" + age);
		rdf.seek(0);
		for(int i = 0;i<b.length;i++){
			b[i] = rdf.readByte();
		}
		name = new String(b);
		age = rdf.readInt();
		System.out.println("第一个人的信息----->姓名:" + name + "年龄:" + age);
		rdf.close();         //关闭
	}
}