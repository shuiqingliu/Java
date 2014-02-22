interface A{
	public  void printA();
	abstract class  B{
		public abstract void printB();
	}
}
class X implements A{
	public void printA(){
		System.out.println("A -----hello");
	}
	class Y extends B{
		public void printB(){
			System.out.println("B -------hello");
		}
	}
}
public class InnerExtDemo02{
	public static void main(String[] args) {
		A.B b = new X().new Y();
		b.printB();
	}
}