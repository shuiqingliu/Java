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
public class InstanceofDemo04{
	public static void main(String[] args) {
		fun(new B());
		fun(new C());
	}
	public static void fun(A a){
		a.fun1();
		if(a instanceof B){
			B b = (B)a;
			b.fun3();
		}
		if(a instanceof C){
			C c = (C)a;
			c.fun5();
		}
	}
}