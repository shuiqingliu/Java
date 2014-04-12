import java.util.*;
public class ScannerDemo01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数据：");
		scan.useDelimiter("\n");
		String str = scan.next();
		System.out.println("输入的数据为：" + str);
	}
}