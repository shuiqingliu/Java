public class InterDemo04{
	public static void main(String[] args){
		System.out.print("第一次运行:");
		fun("qingliu","1234","test","ok");
		System.out.print("第二次运行:");
		fun("qingliu");
	}
	public static void fun(Object...args){
		for(int i = 0;i < args.length;i++){
			System.out.print(args[i] + "、");
		}
	}
}