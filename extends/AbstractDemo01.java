abstract class A{
	public static final String FLAG = "CHINA";
	public String name = "qingliu";
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public abstract void print();
}
class B extends A{
	public void print(){
		System.out.println("FLAG:" + FLAG);
		System.out.println("name:" + super.getName());
	} 
}
public class AbstractDemo01{
	public static void main(String[] args){
		B b = new B();
		b.print();
	}
}