import java.io.*;
public class FileDemo03{
	public static void main(String[] args){
		File f = new File("d:"+File.separator+"test.txt");
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}