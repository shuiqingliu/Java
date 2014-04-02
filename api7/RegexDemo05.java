import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo05{
	public static void main(String[] args){
		String str = "A002335B45000C34324D00123E210000F021H";       //此字符串由数字组成
		String pat = "\\d+";
		Pattern p = Pattern.compile(pat);
		String s[] = p.split(str);
		Matcher m = p.matcher(str);
		String newString = m.replaceAll("_");
		System.out.println(newString);
	}
}