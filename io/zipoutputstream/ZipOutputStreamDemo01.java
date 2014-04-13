import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
public class ZipOutputStreamDemo01{
	public static void main(String[] args) throws Exception{
		File file = new File("d:" + File.separator + "QQ5.0Trial.exe");
		File zipFile = new File("d:" + File.separator + "QQ5.0Trial.zip");
		InputStream input = new FileInputStream(file);
		ZipOutputStream zipOut = null;
		zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		zipOut.setComment("www.shuiqingliu.com");
		int temp = 0;
		while((temp = input.read())!= -1){
			zipOut.write(temp);
		}
		input.close();
		zipOut.close();
	}
}
