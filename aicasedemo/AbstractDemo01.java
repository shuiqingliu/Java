abstract class A{
	public abstract void print();
}
class B extends A{
	public void print(){
		System.out.println("Hello qingliu!");
	}
}
public class AbstractDemo01{
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}