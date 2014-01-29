public class StringAPIDemo08{
	public static void main(String[] args){
		String str1 = "hello world";
		String s[] = str1.split(" ");
		for(int i = 0;i < s.length;i++){
			System.out.println(s[i]);
		}
	}
}