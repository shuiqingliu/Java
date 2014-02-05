class Outer{
	private static String info = "hello world";
	static class Inner{
		public void print(){
			System.out.println(info);
		}
	}
	public void fun(){
		new Inner().print();
	}
}
public class InnerClassDemo02{
	public static void main(String[] args){
		new Outer.Inner().print();
	}
}