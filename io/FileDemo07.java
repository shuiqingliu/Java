import java.io.*;
public class FileDemo07{
	public static void main(String[] args){
		File f = new File("d:"+File.separator+"qingliu");
		f.mkdir();
		// if(f.exists()){
		// 	f.delete();
		// }else{
		// 	try{
		// 		f.createNewFile();
		// 	}catch(IOException e){
		// 		e.printStackTrace();
		// 	}
		// }
		
	}
}