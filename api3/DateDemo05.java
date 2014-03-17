import java.text.*;
import java.util.*;
public class DateDemo05{
	public static void main(String[] args){
		String str1 = "2014-03-17 10:23:45:375";
		String pat1 = "yyyy-MM-dd HH:mm:ss:SSS";
		String pat2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
		SimpleDateFormat sdf1 = new SimpleDateFormat(pat1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pat2);
		Date d = null;
		try{
			d = sdf1.parse(str1);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(sdf2.format(d));
	}
}