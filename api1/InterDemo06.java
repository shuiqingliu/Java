import java.util.ResourceBundle;
import java.util.Locale;
import java.text.*;
public class InterDemo06{
	public static void main(String[] args){
		Locale zhloc = new Locale("zh","CN");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhloc);
		String str1 = zhrb.getString("info");
		System.out.println("中文:" + MessageFormat.format(str1,"清流"));		
	}
}