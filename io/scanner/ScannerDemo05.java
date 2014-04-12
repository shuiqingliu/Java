import java.util.*;
import java.text.*;
import java.io.*;
public class ScannerDemo05{
	public static void main(String[] args) throws Exception{
		File f = new File(File.separator + "home" + File.separator 
					+ "qingliu" + File.separator + "test.txt");			
		Scanner scan = new Scanner(f);
		scan.useDelimiter("\n");
		StringBuffer str = new StringBuffer();
		while(scan.hasNext()){
			str.append(scan.next()).append("\n");
		}
		System.out.println(str);
	}
}