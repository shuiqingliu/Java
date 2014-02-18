class Person{
	private String name;
	private int age;
	public Person(){
		System.out.println("父类中的构造方法");
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
}
class Student extends Person{
	private String school;
	public Student(){
		System.out.println("子类中的构造方法");
	}
	public void setSchool(String school){
		this.school = school;
	}
	public String getSchool(){
		return this.school;
	}
	public void fun(){
		System.out.println("父类的name属性" + getName());
		System.out.println("父类的age属性" + getAge());
	}
}
public class ExtDemo04{
	public static void main(String[] args){
		Student stu = new Student();
		stu.setName("qingliu");
		stu.setAge(22);
		stu.setSchool("华科");
		System.out.println("姓名:" + stu.getName() + ",年龄:" + stu.getAge() + ",学校:" + stu.getSchool());
	}
}