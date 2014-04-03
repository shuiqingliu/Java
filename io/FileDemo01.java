import java.io.*;
public class FileDemo01{
	public static void main(String[] args){
		File f = new File("d:\\test.txt");
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}