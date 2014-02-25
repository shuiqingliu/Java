public class ExceptionDemo06{
	public static void main(String[] args){
		System.out.println("***************** 计算开始 *****************");
		int i = 0;
		int j = 0;		
		
		try{
			String str1 = args[0];
			String str2 = args[1];
			i = Integer.parseInt(str1);
			j = Integer.parseInt(str2);
			int temp = i /j;
			System.out.println("计算结果是:" + temp);
		}
		catch(ArithmeticException e){
			System.out.println("算数异常:" + e);
		}catch(NumberFormatException e){
			System.out.println("数字转换异常:" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界异常:" + e);
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("其他异常:" + e);
		}
		finally{
			System.out.println("不管是否出现异常都执行");
		}
		System.out.println("***************** 计算结束 *****************");
	}
}