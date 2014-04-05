import java.io.*;
public class FileDemo09{
	public static void main(String[] args){
		File f = new File("d:"+File.separator);
		File[] files = f.listFiles();
		for(int i =0;i< files.length;i++){
			System.out.println(files[i]);
		}
	}
}