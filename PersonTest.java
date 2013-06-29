class  Person
{
	//定义一个实例Field
	public String name;
	//定义一个类Field
	public static int eyeNum;
	
}
public class PersonTest
{
	public static void main (String[] args)
	{
		//Person 类已经初始化了，则eyeNum 变量起作用了，输出0
		System.out.println("Person 的eyeNum类Field值：" + Person.eyeNum);
		//创建Person对象
		Person p = new Person();
		//通过Person对象的引用p来访问Person对象的name 实例 Field
		//并通过实例访问eyeNum 类Field
		System.out.println("p 变量的name Field 值是：" + p.name + "p 对象的eyeNum Field 值是：" + p.eyeNum);
		//直接为name实例 Field  赋值
		p.name = "孙悟空";
		//通过p访问eyeNum 类Field  ，依然是访问 Person 的eyeNum 类Field
		p.eyeNum = 2;
		//再次通过Person 对象来访问name实例Field 的eyeNum 类Field
		System.out.println("p 变量的name field 值是：" + p.name + "p 对象的eyeNum Field 值是：" + p.eyeNum);
		//前面通过p修改了Person 的 eyeNum ，此处的Person.eyeNum 将输出2
		System.out.println("Person 的eyeNum 类Field 值是：" + Person.eyeNum);
		Person p2 = new Person();
		//p2 访问 eyeNum 类的 Field 依然引用Person 类的 ，因此依然输出 2
		System.out.println("p2对象的eyeNum 类 Field 值 ：" + p2.eyeNum);
		
	}
}