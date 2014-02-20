interface A{
	public static final String AUTHOE = "qingliu";
	public void printA();
}
interface B{
	public void printB();
}
interface C extends A,B{
	public void printC();
}
class X implements C{
	public void printA(){
		System.out.println("A,Hello World");
	}
	public void printB(){
		System.out.println("B,Hello");
	}
	public void printC(){
		System.out.println("C,TEST");
	}
}
public class InterfaceDemo04{
	public static void main(String[] args) {
			X x = new X();
			x.printA();
			x.printB();
			x.printC();
		}	
}
