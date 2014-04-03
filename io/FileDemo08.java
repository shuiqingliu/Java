import java.io.*;
public class FileDemo08{
	public static void main(String[] args){
		File f = new File("d:"+File.separator);
		String[] str = f.list();
		for(int i =0;i< str.length;i++){
			System.out.println(str[i]);
		}
	}
}