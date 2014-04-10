import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class SystemDemo05{
	public static void main(String[] args) throws Exception{
		System.setOut(
			new PrintStream(new FileOutputStream("d:"
			 + File.separator + "log.txt")));
		System.out.print("qingliu,2014.4.10");
		System.out.println(",room");

	}
}