import java.io.OutputStream;
import java.io.IOException;
public class SystemDemo01{
	public static void main(String[] args){
		OutputStream out = System.out;
		try{
			out.write("hello world".getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
		try{
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}