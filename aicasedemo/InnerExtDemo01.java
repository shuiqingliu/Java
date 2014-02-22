abstract class A{
	public abstract void printA();
	interface B{
		public void printB();
	}
}
class X extends A{
	public void printA(){
		System.out.println("A -----hello");
	}
	class Y implements B{
		public void printB(){
			System.out.println("B -------hello");
		}
	}
}
public class InnerExtDemo01{
	public static void main(String[] args) {
		A.B b = new X().new Y();
		b.printB();
	}
}