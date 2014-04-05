import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo03{
	public static void main(String[] args){
		String str = "1995-08-23";       //此字符串由数字组成
		String pat = "\\d{4}-\\d{2}-\\d{2}";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(str);
		if(m.matches()){
			System.out.println("日期格式正确");
		}else{
			System.out.println("日期格式不正确");
		}
	}
}