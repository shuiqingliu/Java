class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名: " + this.name + ", 年龄： " + this.age;
	}
	public void finalize() throws Throwable{
		System.out.println("对象被释放------>" + this);
	}
}
public class SystemDemo03{
	public static void main(String[] args){
		Person per = new Person("qingliu",45);
		per = null;
		System.gc();
	}
}