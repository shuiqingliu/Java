import java.util.ResourceBundle;
import java.util.Locale;
public class InterDemo02{
	public static void main(String[] args){
		Locale zhloc = new Locale("zh","CN");
		Locale enloc = new Locale("en","US");
		Locale frloc = new Locale("fr","FR");
		ResourceBundle zhrb = ResourceBundle.getBundle("Message",zhloc);
		ResourceBundle enrb = ResourceBundle.getBundle("Message",enloc);
		ResourceBundle frrb = ResourceBundle.getBundle("Message",frloc);
		System.out.println("中文:" + zhrb.getString("info"));
		System.out.println("英文:" + enrb.getString("info"));
		System.out.println("法文:" + frrb.getString("info"));

	}
}