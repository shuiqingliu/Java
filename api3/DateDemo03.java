import java.text.DateFormat;
import java.util.Date;
public class DateDemo03{
	public static void main(String[] args){
		DateFormat dt1 = null;
		DateFormat dt2 = null;
		dt1 = DateFormat.getDateInstance();
		dt2 = DateFormat.getDateTimeInstance();
		System.out.println("date " + dt1.format(new Date()));
		System.out.println("datetime " + dt2.format(new Date()));
	}
}