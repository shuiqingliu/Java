import java.math.*;
class MyMath{
	public static double add(double d1,double d2){
		BigDecimal bid1 = new BigDecimal(d1);
		BigDecimal bid2 = new BigDecimal(d2);
		return bid1.add(bid2).doubleValue();
	}
	public static double sub(double d1,double d2){
		BigDecimal bid1 = new BigDecimal(d1);
		BigDecimal bid2 = new BigDecimal(d2);
		return bid1.subtract(bid2).doubleValue();
	}
	public static double mul(double d1,double d2){
		BigDecimal bid1 = new BigDecimal(d1);
		BigDecimal bid2 = new BigDecimal(d2);
		return bid1.multiply(bid2).doubleValue();
	}
	public static double div(double d1,double d2,int len){
		BigDecimal bid1 = new BigDecimal(d1);
		BigDecimal bid2 = new BigDecimal(d2);
		return bid1.divide(bid2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public static double round(double d,int len){
		BigDecimal b1 = new BigDecimal(d);
		BigDecimal b2 = new BigDecimal(1);
		return b1.divide(b2,len,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
public class BigDecimalDemo04{
	public static void main(String[] args){
		System.out.println("加法操作：" + MyMath.round(MyMath.add(3245.341154,12446.457667),4));
		System.out.println("减法操作：" + MyMath.round(MyMath.sub(3245.341154,12446.457667),4));
		System.out.println("乘法操作：" + MyMath.round(MyMath.mul(3245.341154,12446.457667),4));
		System.out.println("减法操作：" + MyMath.add(3245.341154,12446.457667));
		System.out.println("减法操作：" + MyMath.sub(3245.341154,12446.457667));
		System.out.println("乘法操作：" + MyMath.mul(3245.341154,12446.457667));
		System.out.println("除法操作：" + MyMath.div(3245.341154,12446.457667,8));
		System.out.println("除法操作：" + MyMath.div(3245.341154,12446.457667,7));
	}
}
