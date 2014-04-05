import java.io.*;
public class FileDemo05{
	public static void main(String[] args){
		File f = new File("d:"+File.separator+"test.txt");
		if(f.exists()){
			f.delete();
		}
		
	}
}