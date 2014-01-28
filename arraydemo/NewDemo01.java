public class NewDemo01{
	public static void main(String[] args){
		System.out.print("\n不传递参数(fun()):");
		fun();
		System.out.print("\n传递一个参数(fun(1)):");
		fun(1);
		System.out.print("\n传递五个参数(fun(1,2,3,4,5)):");
		fun(1,2,3,4,5);
	}
	public static void fun(int ... arg){
		for(int i = 0;i < arg.length;i++){
			System.out.print(arg[i] + "、");
		}
	}
}