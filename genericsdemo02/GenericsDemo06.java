public class GenericsDemo06{
	public static void main(String[] args){
		Integer i[] = fun1(1,2,3,4,5);
		fun2(i);
	}
	public static <T> T[] fun1(T...arg){
		return arg;
	}
	public static <T> void fun2(T parme[]){
		System.out.println("接收泛型数组:");
		for(T t:parme){
			System.out.print(t + "、");
		}
	}
}