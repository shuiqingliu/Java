class Outer{
	private String info = "hello world";
	public void fun(){
		class Inner{
		public void print(){
			System.out.println(info);
		}
	}
		new Inner().print();
	}
}
public class InnerClassDemo04{
	public static void main(String[] args){
		new Outer().fun();
	}
}