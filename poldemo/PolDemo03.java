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
public class PolDemo03{
	public static void main(String[] args) {
		A a = new A();
		B b1 = (B)a;
		b1.fun1();
		b1.fun2();
		b1.fun3();
	}
}