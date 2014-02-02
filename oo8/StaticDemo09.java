public class StaticDemo09{
	public static void main(String[] args){
		new StaticDemo09().fun();
	}
	public void fun(){                                   //少了static,然后用对象调用
		System.out.println("hello world!");
	}
}