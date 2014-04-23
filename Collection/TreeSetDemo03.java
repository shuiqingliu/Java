import java.util.TreeSet;
import java.util.Set;
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "姓名:" + this.name + ",年龄:" + this.age;
	}
	public int compareTo(Person per){
		if(this.age > per.age){
			return 1;
		}else if(this.age < per.age){
			return -1;
		}else{
			return this.name.compareTo(per.name);
		}
	}
}
public class TreeSetDemo03{
	public static void main(String[] args){
		Set<Person> allSet = new TreeSet<Person>();
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