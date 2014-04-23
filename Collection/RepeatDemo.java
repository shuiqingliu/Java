import java.util.HashSet;
import java.util.Set;
class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名:" + this.name + ",年龄:" + this.age;
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(!(obj instanceof Person)){
			return false;
		}
		Person p = (Person)obj;
		if(this.name.equals(p.name)&& this.age == p.age){
			return true;
		}else{
			return false;
		}
		
	}
	public int hashCode(){
			return this.name.hashCode()*this.age;
		}

}
public class RepeatDemo{
	public static void main(String[] args){
		Set<Person> allSet = new HashSet<Person>();
		allSet.add(new Person("张三",23));
		allSet.add(new Person("李四",24));
		allSet.add(new Person("王五",25));
		allSet.add(new Person("赵六",25));
		allSet.add(new Person("张三",23));
		allSet.add(new Person("张三",23));
		allSet.add(new Person("张三",23));
		System.out.println(allSet);
	}
}