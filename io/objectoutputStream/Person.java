import java.io.Serializable;
public class Person implements Serializable{		//实现serializable接口
	private String name;	//声明name属性
	private int age;	//声明age属性
	public Person(String name,int age){		//通过构造设置内容
		this.name = name;
		this.age = age;
	}
	public String toString(){	//覆写toString方法
		return "姓名" + this.name + "年龄:" + this.age;
	}
}
