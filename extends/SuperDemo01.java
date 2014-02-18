class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String getInfo(){
		return "姓名:" +  this.getName() + ",年龄:" + this.getAge();
	}
}
class Student extends Person{
	private String school;
	public Student(String name,int age,String school){
		super(name,age);
		this.setSchool(school);
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
	public String getInfo(){
		return super.getInfo() + ",学校: " + this.getSchool();
	}
}
public class SuperDemo01{
	public static void main(String[] args){
		Student stu = new Student("张三",30,"华科");
		System.out.println(stu.getInfo());
	}
}