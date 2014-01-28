public class NewDemo02{
	public static void main(String[] args){
		System.out.print("\n不传递参数(fun()):");
		fun();
		System.out.print("\n传递一个参数(fun(1)):");
		fun(1);
		System.out.print("\n传递五个参数(fun(1,2,3,4,5)):");
		fun(1,2,3,4,5);
	}
	public static void fun(int ... arg){
		for(int x:arg){                                 //foreach输出
			System.out.print(x + "、");
		}
	}
}