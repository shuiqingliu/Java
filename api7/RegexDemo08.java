import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo08{
	public static void main(String[] args){
		String str = "JAVA:90|PHP:70|C++:80";       //此字符串由数字组成
		String s[] = str.split("\\|");
		for(int i = 0;i< s.length;i++){
			String s2[] = s[i].split(":");
			System.out.println(s2[0] + "\t" + s2[1]);
		}
	}
}