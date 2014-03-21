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
	public static double div(double d1,double d2){
		BigDecimal bid1 = new BigDecimal(d1);
		BigDecimal bid2 = new BigDecimal(d2);
		return bid1.divide(bid2).doubleValue();
	}
}
public class BigDecimalDemo01{
	public static void main(String[] args){
		System.out.println("加法操作" + MyMath.add(3245.341154,12446.457667));
	}
}
