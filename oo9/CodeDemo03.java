class Demo{
	{
		System.out.println("构造块");
	}
	static{
		System.out.println("静态代码块");
	}
	public Demo(){
		System.out.println("构造方法");
	}
}
public class CodeDemo03{
	static{
		System.out.println("主方法中的静态代码块");
	}
	public static void main(String args[]){
		new Demo();
		new Demo();
		new Demo();
		new Demo();
	}
}