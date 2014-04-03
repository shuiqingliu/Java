import java.io.*;
public class FileDemo04{
	public static void main(String[] args){
		File f = new File("d:"+File.separator+"test.txt");
		f.delete();
	}
}