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
	public void say(){
		System.out.println(this.getContent());
	}
	public abstract String getContent();
}
class Student extends Person{
	private float score;
	public Student(String name,int age,float score){
		super(name,age);
		this.score = score;
	} 
	public String getContent(){
		return "学生信息------>姓名" + super.getName() +
				"年龄：" + super.getAge() + 
				"成绩:" + this.score;
	}
}
class Worker extends Person{
	private float salary;
	public Worker(String name,int age,float salary){
		super(name,age);
		this.salary = salary;
	}
	public String getContent(){
		return "工人信息----->姓名：" +super.getName() +
				"年龄：" + super.getAge() + 
				"工资:" + this.salary;
	}
}
public class AbstractDemo02{
	public static void main(String[] args) {
		Person per1 = null;
		Person per2 = null;
		per1 = new Student("qingliu",23,749.3f);
		per2 = new Worker("stupid",45,234.5f);
		per1.say();
		per2.say();
	}
}