class Person{
	String name;
	int age;
	static String country = "A城";
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void info(){
		System.out.println("姓名:" + this.name + ", 年龄:" + this.age + ", 城市:" + country);
	}
}
public class StaticDemo03{
	public static void main(String[] args){
		Person per1 = new Person("张三",30);
		Person per2 = new Person("李四",31);
		Person per3 = new Person("王五",32);
		System.out.println("--------------修改之前---------------");
		per1.info();
		per2.info();
		per3.info();
		//per1.country = "B城";
		Person.country = "B城";
		System.out.println("--------------修改之后---------------");
		per1.info();
		per2.info();
		per3.info();
	}
}