class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名:"+ this.name +  "  年龄:" + this.age;
	}
}
public class ObjectDemo01{
	public static void main(String[] args) {
		Person per = new Person("张三",34);
		System.out.println(per);

	}
}