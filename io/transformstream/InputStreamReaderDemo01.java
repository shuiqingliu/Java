import java.io.*;
public class InputStreamReaderDemo01{
	public static void main(String[] args) throws Exception{
		File f = new File(File.separator + "home" + File.separator + "qingliu"+ File.separator+ "test.txt");
		Reader input  = null;
		input = new InputStreamReader(new FileInputStream(f));
		char c[] = new char[1024];
		int len = input.read(c);
		input.close();
		System.out.println(new String(c,0,len));
	}
}
