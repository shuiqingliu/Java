class Parent
{
	public String tag = "疯狂java";
}
class Derived extends 	Parent
{
	//定义一个私有的tag 实例变量来隐藏父类的tag 实例变量
	private  String tag = "轻量级java ee 企业应用实践";
}
public class HideTest
{
	public static void main (String[] args)
	{
		Derived d = new Derived();
		//程序不可以 访问d的私有变量tag，所以下面语句将引起 编译错误
		//System.out.println(d.tag);
		//将d变量显示地向上转型为Parent 后，即可访问tag 实例变量
		//程序将输出：”疯狂java“
		System.out.println(((Parent)d).tag);
	}
}