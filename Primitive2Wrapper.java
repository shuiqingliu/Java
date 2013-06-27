public class Primitive2Wrapper
{
	public static void main (String[] args)
	{
		boolean b1 =  true ;
		//通过构造器把b1 基本类型变量包装成类对象
		Boolean b1Obj = new Boolean(b1);
		int it = 5;
		//通过构造器把it基本类型变量包装成 包装类对象
		Integer itObj = new Integer(it);
		//把一个字符串转化成Float 对象
		Float f1 = new Float("4.56");
		//把一个字符串转化为Boolean对象
		Boolean bObj = new Boolean("false");
		//下面程序运行时将出现java.lang.NumberFormatExcpetion 异常
		//Long lObj = new Long("ddd");
	}
}
