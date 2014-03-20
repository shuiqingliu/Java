import java.text.*;
class FormatDemo{
	public void format1(String pattern,double value){
		DecimalFormat df = null;
		df = new DecimalFormat(pattern);
		String str = df.format(value);
		System.out.println("使用" + pattern + "格式化" + value + "；" + str); 
	}
}
public class NumberDemo04{
	public static void main(String[] args){
		FormatDemo fd = new FormatDemo();
		fd.format1("###,###.###",111222.34565778);
		fd.format1("000,000.000",11222.34565778);
		fd.format1("000,000.000￥",11222.34565778);
		fd.format1("000,000.000$",11222.34565778);
		fd.format1("###.###%",0.34565778);
		fd.format1("###.###\u2030",0.34565778);
		fd.format1("00.###%",0.034565778);
	}
}