class Demo{
	public <T> T fun(T t){
		return t;
	}
}
public class GenericsDemo03{
	public static void main(String[] args){
		Demo d = new Demo();
		String s = d.fun("qingliu");
		int i = d.fun(30);
		System.out.println(s);
		System.out.println(i);

	}
}