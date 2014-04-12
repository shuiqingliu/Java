import java.util.*;
public class ScannerDemo02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入整数：");
		int i = 0;
		float f = 0.0f;
			if(scan.hasNextInt()){
				i = scan.nextInt();
				System.out.println("输入的整数为：" + i);
			}else{
				System.out.println("输入的不是整数");
			}
		System.out.print("请输入小数:");
		if(scan.hasNextFloat()){
			f = scan.nextFloat();
			System.out.println("输入的小数为：" + f);
		}else{
			System.out.println("输入的不是小数!");
		}

	}
}