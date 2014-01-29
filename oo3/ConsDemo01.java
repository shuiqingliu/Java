class Person{
	public Person(){
		System.out.println("一个新的对象产生");
	}
}
public class ConsDemo01{
	public static void main(String[] args){
		System.out.println("声明一个对象 Person per = null");
		Person per = null;
		System.out.println("实例化一个对象per = new Person()");
		per = new Person();
	}
}