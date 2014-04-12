import java.util.*;
import java.text.*;
public class ScannerDemo03{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = null;
		Date date = null;
		System.out.print("请输入日期(yyyy-MM-dd):");
		if(scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")){
			str = scan.next("^\\d{4}-\\d{2}-\\d{2}$");
			try{
				date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
			}catch(Exception e){}
		}else{
			System.out.println("输入的日期格式不正确");
		}
		System.out.println(date);
	}
}