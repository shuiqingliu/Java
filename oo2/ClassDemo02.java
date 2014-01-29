class Person{
	String name;
	int age;
	public void tell(){
		System.out.println("姓名：" +  name + ", 年龄：" + age);
	}
}
public class ClassDemo02{
	public static void main(String[] args) {
		Person per1 = new Person();
		Person per2 = new Person();
		per1.name = "张三";
		per1.age = 12;
		per2.name = "李四";
		per2.age = 44;
		System.out.print("per1中的内容---->");
		per1.tell();
		System.out.print("per2中的内容----->");
		per2.tell();
	}
}

