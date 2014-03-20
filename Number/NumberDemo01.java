import java.text.*;
public class NumberDemo01{
	public static void main(String[] args){
		NumberFormat  nf = null;
		nf = NumberFormat.getInstance();
		System.out.println("格式化之后的数字：" + nf.format(100000000));
	}
}