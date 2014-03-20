import java.text.*;
class FormatDemo{
	public void format1(String pattern,double value){
		DecimalFormat df = null;
		df = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println("使用" + pattern + "格式化" + value + "；" + str); 
	}
}
public class NumberDemo03{
	public static void main(String[] args){
		FormatDemo fd = new FormatDemo();
		fd.format1("###,###.###",111222.345);
	}
}