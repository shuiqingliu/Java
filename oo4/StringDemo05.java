public class StringDemo05{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = str2;
		System.out.println("str1和str2用equals---->" + str1.equals(str2));
		System.out.println("str1和str3用equals---->" + str1.equals(str3));
		System.out.println("str2和str3用equals---->" + str2.equals(str3));
		
	}
}