import java.io.*;
public class OutputStreamWriterDemo01{
	public static void main(String[] args) throws Exception{
		File f = new File(File.separator + "home" + File.separator + "qingliu"+ File.separator+ "test.txt");
		Writer out = null;
		out = new OutputStreamWriter(new FileOutputStream(f));
		out.write("hello qingliu!!!");
		out.close();
	}
}
