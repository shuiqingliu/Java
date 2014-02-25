class Math{
	public int div(int i,int j) throws Exception{
		int temp = i /j;
		return temp;
	}
}
public class ThrowsDemo01{
	public static void main(String[] args) {
		Math ma = new Math();
		try{
			System.out.println("除法操作 :" + ma.div(10,2));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}