interface A{
	public abstract void print();
}
class B implements A{
	public void print(){
		System.out.println("Hello qingliu!");
	}
}
public class InterfaceDemo01{
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}