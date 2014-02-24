public class WapperDemo04{
	public static void main(String[] args){
		String str1 = "34";
		String str2 = "30.3";
		int x = Integer.parseInt(str1);
		float f = Float.parseFloat(str2);
		System.out.println("整数乘方:" + x + "*" + x + " = " + (x*x));
		System.out.println("小数乘方:" + f + "*" + f + " = " + (f*f));
	}
}