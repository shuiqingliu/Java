class Person{
	void print(){
		System.out.println("Person -----> void print()");
	}
}
class Student extends Person{
	public void print(){
		super.print();
		System.out.println("Student -----> void print()");
	}
}
public class OverrideDemo02{
	public static void main(String[] args){
		Student stu = new Student();
		stu.print();
	}
}