import java.io.*;
public class FileDemo11{
	public static void main(String[] args){
		File my = new File("d:" +File.separator);
		print(my);
	}
	public static void print(File file){
		if(file != null){
			if(file.isDirectory()){
				File f[] = file.listFiles();
				if(f != null){
					for(int i = 0;i< f.length;i++){
						print(f[i]);
					}
				}
			}else{
					System.out.println(file);
				}		
		}
	}
}