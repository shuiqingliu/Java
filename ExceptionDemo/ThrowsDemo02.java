class Math{
	public int div(int i,int j) throws Exception{
		int temp = i /j;
		return temp;
	}
}
public class ThrowsDemo02{
	public static void main(String[] args) throws Exception{
		Math ma = new Math();
		ma.div(10,0);
	}
}