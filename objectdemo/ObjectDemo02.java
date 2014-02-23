class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person per = (Person) obj;
		if(per.name.equals(this.name)&&per.age == this.age){
			return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return "姓名:"+ this.name +  "  年龄:" + this.age;
	}
}
public class ObjectDemo02{
	public static void main(String[] args) {
		Person per1 = new Person("张三",34);
		Person per2 = new Person("张三",34);
		System.out.println(per1.equals(per2)?"是同一个人" : "不是同一个人");
	}
}