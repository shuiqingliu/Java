import java.util.regex.Pattern;
public class RegexDemo02{
	public static void main(String[] args){
		String str = "0123456789";       //此字符串由数字组成
		if(Pattern.compile("[0-9]+").matcher(str).matches()){
			System.out.println("是由数字组成");
		}else{
			System.out.println("不是由数字组成");
		}
	}
}