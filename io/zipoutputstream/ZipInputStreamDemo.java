import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipFile;
import java.io.FileOutputStream;
public class ZipInputStreamDemo{
	public static void main(String[] args) throws Exception{
		File file = new File("d:" + File.separator + "xxoodir.zip");        //找到ZIP 文件
		File outFile= null;
		ZipFile zipFile = new ZipFile(file);   //实例化ZipFile对象
		ZipInputStream zipInput = null;    //定义压缩输入流
		OutputStream out = null;        //定义输出流，输出每一个实体
		InputStream input = null;       //定义输入流，读取每一个ZipEntry
		ZipEntry entry = null;			 //每一个压缩实体
		zipInput = new ZipInputStream(new FileInputStream(file));   //实例化ZipInputStream
		while((entry = zipInput.getNextEntry())!=null){
			System.out.println("压缩实体名称" + entry.getName());
			outFile = new File("d:" + File.separator + entry.getName());   //定义输出文件
			if(!outFile.getParentFile().exists()){
				outFile.getParentFile().mkdir();
			}
			if(!outFile.exists()){
				outFile.createNewFile();
			}
			input = zipFile.getInputStream(entry);    //得到每一个实体的输入流
			out = new FileOutputStream(outFile);  //实例化文件输出流
			int temp = 0;
			while((temp = input.read())!= -1){
				out.write(temp);
			}
			input.close();
			out.close();
		}
		input.close();
	}
}
