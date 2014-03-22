class Person implements Cloneable{
	private String name;
	public Person(String name){
		this.setName(name);
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public String toString(){
		return "姓名 : " + this.name;
	}

}
public class CloneDemo01{
	public static void main(String[] args) throws Exception{
		Person p1 = new Person("张三");
		Person p2 = (Person)p1.clone();
		p2.setName("李四");
		System.out.println("原始对象 :" + p1);
		System.out.println("克隆后的对象 :" + p2);
	}
}