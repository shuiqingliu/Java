class Person{
	String name;
	int age;
	String contry = "A城";
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void info(){
		System.out.println("姓名:" + this.name + ", 年龄:" + this.age + ", 城市:" + contry);
	}
}
public class StaticDemo01{
	public static void main(String[] args){
		Person per1 = new Person("张三",30);
		Person per2 = new Person("李四",31);
		Person per3 = new Person("王五",32);
		per1.info();
		per2.info();
		per3.info();
	}
}