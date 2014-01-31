class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.setName(name);
		this.setAge(age);
	}
	public boolean compare(Person per){
		Person p1 = this;
		Person p2 = per;
		if(p1 == p2){
			return true;
		}
		if(p1.name.equals(p2.name) && p1.age == p2.age){
			return true;
		}else{
			return false;
		}
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
}
public class ThisDemo05{
	public static void main(String[] args){
		Person per1 = new Person("张三",30);
		Person per2 = new Person("张三",30);
		if(per1.compare(per2)){
			System.out.println("两个对象相等!");
		}else{
			System.out.println("两个对象不相等1");
		}
	}
}