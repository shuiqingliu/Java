public class InterDemo05{
	public static void main(String[] args){
		Object[] args1 ={"qingliu","1234","test","ok"};
		Object[] args2 ={"qingliu","1234"};
		Object[] args3 ={};
		System.out.print("第一次运行:");
		fun(args1);
		System.out.print("\n" +"第二次运行:");
		fun(args2);
		System.out.print("\n" +"第三次运行:");
		fun(args3);
	}
	public static void fun(Object...args){
		for(int i = 0;i < args.length;i++){
			System.out.print(args[i] + "、");
		}
	}
}