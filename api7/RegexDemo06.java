import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo06{
	public static void main(String[] args){
		String str = "A002335B45000C34324D00123E210000F021H".replaceAll("\\d+","_");       //此字符串由数字组成
		System.out.println("字符串为" + str);
	}
}