abstract class A{
	public A(){
		System.out.println("抽象类中的构造方法");
	}
}
class B extends A{
	public B(){
		System.out.println("子类中的构造方法");
	}
}
public class AbstractDemo02{
	public static void main(String[] args){
		B b = new B();
	}
}