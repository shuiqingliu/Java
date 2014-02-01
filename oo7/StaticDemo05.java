class Demo{
	private static int count = 0;
	public Demo(){
		count++;
		System.out.println("产生了" + count + "个对象");
	}
}
public class StaticDemo05{
	public static void main(String[] args){
		new Demo();
		new Demo();
		new Demo();
		new Demo();
	}
}