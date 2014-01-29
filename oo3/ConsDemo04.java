class Person{
	private String name;
	private int age;
	public Person(String n,int a){
		this.setName(n);
		this.setAge(a);
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void tell(){
		System.out.println("姓名: " + this.getName() + ", 年龄: " + this.getAge());
	}

}
public class ConsDemo04{
	public static void main(String[] args){
		new Person("张三",30).tell();
	}
}