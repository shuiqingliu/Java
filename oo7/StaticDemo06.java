class Demo{
	private String name;
	private static int count = 0;
	public Demo(){
		count++;
		this.name = "DEMO-" + count;
	}
	public Demo(String n){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
public class StaticDemo06{
	public static void main(String[] args){
		System.out.println(new Demo().getName());
		System.out.println(new Demo("qingliu").getName());
		System.out.println(new Demo().getName());
		System.out.println(new Demo().getName());
	}
}