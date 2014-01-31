class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getInfo(){
		return "姓名:" + name + ": 年龄:" + age;
	}
}
public class ThisDemo01{
	public static void main(String[] args){
		Person per1 = new Person("张三",30);
		System.out.println(per1.getInfo());
	}
}