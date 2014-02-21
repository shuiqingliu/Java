class A{
	public void fun1(){
		System.out.println("A -----> public void fun1(){}");
	}
	public void fun2(){
		this.fun1();
	}
}
class B extends A{
	public void fun1(){
		System.out.println("B ------> public void fun1(){}");
	}
	public void fun3(){
		System.out.println("B ------> public void fun3(){}");
	}
}
public class PolDemo02{
	public static void main(String[] args) {
		B b = new B();
		A a = b;
		B b1 = (B)a;
		b1.fun1();
		b1.fun2();
		b1.fun3();
	}
}