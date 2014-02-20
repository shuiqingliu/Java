interface A{
	public static final String AUTHOE = "qingliu";
	public abstract void print();
	public abstract String getInfo();
}
interface B{
	public void say();
}
class X implements A,B{
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
public class InterfaceDemo01{
	public static void main(String[] args) {
			X x = new X();
			x.say();
			x.getInfo();
			x.print();
		}	
}
