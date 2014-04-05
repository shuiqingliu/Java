import java.io.*;
public class FileDemo06{
	public static void main(String[] args){
		File f = new File("d:"+File.separator+"test.txt");
		if(f.exists()){
			f.delete();
		}else{
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}