class Person{
	private String name;
	private int age;
	public Person(){}
	public Person(String n){
		this.setName(n);
	}
	public Person(String n,int a){
		this.setName(n);
		this.setAge(a);
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void tell(){
		System.out.println("姓名: " + this.getName() + ", 年龄: " + this.getAge());
	}

}
public class ConsDemo03{
	public static void main(String[] args){
		System.out.println("声明一个对象 Person per = null");
		Person per = null;
		System.out.println("实例化一个对象per = new Person()");
		per = new Person("张三",30);
		per.tell();
	}
}