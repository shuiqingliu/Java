import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class SystemDemo06{
	public static void main(String[] args){
		String str = "hello";
		try{
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			try{
				System.setOut(
					new PrintStream(new FileOutputStream("d:" + File.separator + "err.log"))
					);
			}catch(Exception e1){

			}
			System.out.println(e);
		}
	}
}