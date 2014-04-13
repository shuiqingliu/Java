import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipFile;
import java.io.FileOutputStream;
public class ZipFileDemo{
	public static void main(String[] args) throws Exception{
		File file = new File("d:" + File.separator + "QQ5.0Trial.zip");        //找到ZIP 文件
		File outputfile = new File("d:" + File.separator + "QQ5.0Trial.exe");   //定义解压缩的文件名称
		ZipFile zipfile = new ZipFile(file);   //实例化ZipFile对象
		ZipEntry entry = zipfile.getEntry("QQ5.0Trial.exe");   //得到一个压缩实体
		OutputStream output = new FileOutputStream(outputfile);
		InputStream input = zipfile.getInputStream(entry);
		int temp = 0;
		while((temp = input.read())!=-1){
			output.write(temp);
		}
		input.close();
		output.close();
	}
}
