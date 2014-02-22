interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("吃苹果");
	}
}
class Orange implements Fruit{
	public void eat(){
		System.out.println("吃橘子");
	}
}
class Factory{
	public static Fruit getInstance(String classname){
		Fruit f = null;
		if("apple".equals(classname)){
			f = new Apple();
		}
		if("orange".equals(classname)){
			f = new Orange();
		}
		return f;
 	}
}
public class InterfaceDemo03{
	public static void main(String[] args) {
		Fruit f = Factory.getInstance(args[0]);
		if(f != null){
			f.eat();
		}
	}
}