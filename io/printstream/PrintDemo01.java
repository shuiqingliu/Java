import java.io.*;
public class PrintDemo01{
	public static void main(String[] args) throws Exception{
		PrintStream ps = null;
		ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "qingliu.txt" )));
		ps.print("hello ");
		ps.println("qingliu");
		ps.print("1+1 =" +2);
		ps.close();
	}
}