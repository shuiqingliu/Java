interface A{
	public static final String AUTHOE = "qingliu";
	public abstract void print();
	public abstract String getInfo();
}
abstract class  B{
	public abstract void say();
}
class X extends B implements A{
	public void say(){
		System.out.println("Hello World");
	}
	public String getInfo(){
		return "Hello";
	}
	public void print(){
		System.out.println("作者:" + AUTHOE);
	}
}
public class InterfaceDemo02{
	public static void main(String[] args) {
			X x = new X();
			x.say();
			x.print();
		}	
}
