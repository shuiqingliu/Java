interface A{
	public void printInfo();
}
class X{
	public void fun1(){
		this.fun2(new A(){
			public void printInfo(){
				System.out.println("Hello World!!!");
			}
			}
			);
	}
	public void fun2(A a){
		a.printInfo();
	}
}
public class NoInnerClassDemo01{
	public static void main(String[] args) {
		new X().fun1();
	}
}