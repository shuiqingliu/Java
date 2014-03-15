import java.util.ResourceBundle;
import java.util.Locale;
import java.text.*;
public class InterDemo03{
	public static void main(String[] args){
		Locale zhloc = new Locale("zh","CN");
		Locale enloc = new Locale("en","US");
		Locale frloc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhloc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enloc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frloc);
		String str1 = zhrb.getString("info");
		String str2 = enrb.getString("info");
		String str3 = frrb.getString("info");
		System.out.println("中文:" + MessageFormat.format(str1,"清流"));
		System.out.println("英文:" + MessageFormat.format(str2,"qingliu"));
		System.out.println("法文:" + MessageFormat.format(str3,"qingliu"));
		
	}
}