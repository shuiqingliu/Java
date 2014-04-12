import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
public class DataOutputStreamDemo{
	public static void main(String[] args) throws Exception{
		DataOutputStream dos = null;            //声明数据输出流对象
		File f = new File("d:" + File.separator + "order.txt");    //文件的保存路径
		dos = new DataOutputStream(new FileOutputStream(f));    //实例化数据输出流
		String name[] ={"衬衣","手套","围巾"};
		float price[] = {98.6f,58.2f,23.7f};
		int nums[] = {3,2,1};
		for(int i =0;i<name.length;i++){
			dos.writeChars(name[i]);
			dos.writeChars("\t");
			dos.writeFloat(price[i]);
			dos.writeChars("\t");
			dos.writeChars("\t");
			dos.writeInt(nums[i]);
			dos.writeChars("\n");
		} 

	}
}