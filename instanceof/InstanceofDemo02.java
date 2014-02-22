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
class C extends A{
	public void fun1(){
		System.out.println("C ------> public void fun1(){}");
	}
	public void fun5(){
		System.out.println("C ------> public void fun5(){}");
	}
}
public class InstanceofDemo02{
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println("A a1 = new B()" + (a1 instanceof A));
		System.out.println("A a1 = new B()" + (a1 instanceof B));
	}
}