class Person{
	private String name;
	private int age;
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

}
public class ExtDemo01{
	public static void main(String[] args){
		Student stu = new Student();
		stu.setName("qingliu");
		stu.setAge(22);
		System.out.println("姓名:" + stu.getName() + ",年龄:" + stu.getAge());
	}
}