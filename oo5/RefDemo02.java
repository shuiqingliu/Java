public class RefDemo02{
	public static void main(String[] args){
		String str1 = "hello";
		System.out.println("fun()调用之前:" + str1);
		fun(str1);
		System.out.println("fun()调用之后:" +  str1);
	}
	public static void fun(String str2){
		str2 = "qingliu";
	}
}