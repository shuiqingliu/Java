class Outer{
	private String info = "hello world";
	public void fun(final int temp){
		class Inner{
		public void print(){
			System.out.println("类中属性:" + info);
			System.out.println("方法的参数" + temp);
		}
	}
		new Inner().print();
	}
}
public class InnerClassDemo05{
	public static void main(String[] args){
		new Outer().fun(30);
	}
}