import java.text.*;
public class NumberDemo02{
	public static void main(String[] args){
		NumberFormat  nf = null;
		nf = NumberFormat.getInstance();
		System.out.println("格式化之后的数字：" + nf.format(100000000));
		System.out.println("格式化之后的数字：" + nf.format(1000.345));
	}
}