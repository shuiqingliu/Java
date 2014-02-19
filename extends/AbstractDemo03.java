abstract class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public abstract String getInfo();
}
class Student extends Person{
	private String school;
	public Student(String name,int age,String school){
		super(name,age);
		this.school = school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
	public String getInfo(){
		return "姓名: " + super.getName() + 
			": 年龄:" + super.getAge() + 
			": 学校:" + this.getSchool();
	}
}
public class AbstractDemo03{
	public static void main(String[] args){
		Student stu = new Student("qngliu",23,"家里蹲");
		System.out.println(stu.getInfo());
	}
}