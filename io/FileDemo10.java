import java.io.*;
public class FileDemo10{
	public static void main(String[] args){
		File f = new File("d:"+File.separator);
		if(f.isDirectory()){
			System.out.println(f.getPath() + " 是目录");
		}else{
			System.out.println(f.getPath() + " 不是目录");
		}
	}
}