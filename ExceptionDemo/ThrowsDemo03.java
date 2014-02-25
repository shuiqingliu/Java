class Math{
	public int div(int i,int j) throws Exception{
		System.out.println("**********计算开始**********");
		int temp = 0;
		try{
			temp = i /j;
		}catch(Exception e){
			throw e;
		}finally{
			System.out.println("**********计算结束**********");
		}
			return temp;
	}
}
public class ThrowsDemo03{
	public static void main(String[] args) throws Exception{
		Math ma = new Math();
		try{
			System.out.println("除法结果:" + ma.div(10,0));
		}catch(Exception e){
			System.out.println("异常产生 :" + e);
		}
	}
}