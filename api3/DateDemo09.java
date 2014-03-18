import java.util.*;
import java.text.*;
class DateTime{
	private SimpleDateFormat sdf = null;
	public String getDate(){
		this.sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		return this.sdf.format(new Date());
	}
	public String getDateComplete(){
		this.sdf  = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SS毫秒");
		return this.sdf.format(new Date());
	}
	public String getDateTime(){
		this.sdf  = new SimpleDateFormat("yyyyMMddHHmmssSSS");	
		return this.sdf.format(new Date());
	}
}
public class DateDemo09{
	public static void main(String[] args){
		DateTime dt = new DateTime();
		System.out.println("系统日期 :" + dt .getDate());
		System.out.println("中文日期 :" + dt .getDateComplete());
		System.out.println("时间戳 :" + dt .getDateTime());
	}
}