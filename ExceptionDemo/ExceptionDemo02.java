public class ExceptionDemo02{
	public static void main(String[] args){
		System.out.println("***************** 计算开始 *****************");		
		int i = 10;
		int j = 0;
		try{
			int temp = i / j;
			System.out.println("计算结果是:" + temp);
		}
		catch(ArithmeticException e){
			System.out.println("产生异常:" + e);
		}
		System.out.println("***************** 计算结束 *****************");
	}
}