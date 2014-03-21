import java.math.BigInteger;
public class BigIntegerDemo02{
	public static void main(String[] args){
		BigInteger bi1 = new BigInteger("123456789");
		BigInteger bi2 = new BigInteger("987654321");
		System.out.println("加法操作 " + bi1.add(bi2));
		System.out.println("减法操作 " + bi1.subtract(bi2));
		System.out.println("乘法操作 " + bi1.multiply(bi2));
		System.out.println("除法操作 " + bi1.divide(bi2));
		System.out.println("最大数 " + bi1.max(bi2));
		System.out.println("最小数 " + bi1.min(bi2));
		BigInteger result[] = bi2.divideAndRemainder(bi1);
		System.out.println("商事：" + result[0] + "余数" + result[1]);
	}
}