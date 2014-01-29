public class StringAPIDemo11{
	public static void main(String[] args){
		String str1 = "hello";
		String str2 = "HELLO";
		System.out.println("\"HELLO\" equals \"hello\"" + str1.equals(str2));
		System.out.println("\"HELLO\" equals \"hello\"" + str1.equalsIgnoreCase(str2));
	}
}