import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class DateDemo04{
	public static void main(String[] args){
		DateFormat dt1 = null;
		DateFormat dt2 = null;
		dt1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD,new Locale("zh","CN"));
		dt2 = DateFormat.getDateTimeInstance(DateFormat.ERA_FIELD,DateFormat.ERA_FIELD,new Locale("zh","CN"));
		System.out.println("date " + dt1.format(new Date()));
		System.out.println("datetime " + dt2.format(new Date()));
	}
}