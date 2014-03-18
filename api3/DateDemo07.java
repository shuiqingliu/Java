import java.util.*;
class DateTime{
	private Calendar calendar = null;
	public DateTime(){
		this.calendar = new GregorianCalendar();
	}
	public String getDate(){
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("-"); //增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH),2)).append("-");
		buf.append(this.addZero((calendar.get(Calendar.DAY_OF_MONTH)+1),2)).append(" ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append(":");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append(":");
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append(":");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3));
		return buf.toString();
	}
	public String getDateComplete(){
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR)).append("年"); //增加年
		buf.append(this.addZero(calendar.get(Calendar.MONTH),2)).append("月");
		buf.append(this.addZero((calendar.get(Calendar.DAY_OF_MONTH)+1),2)).append("日 ");
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY),2)).append("时");
		buf.append(this.addZero(calendar.get(Calendar.MINUTE),2)).append("分");
		buf.append(this.addZero(calendar.get(Calendar.SECOND),2)).append("秒");
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND),3)).append("毫秒");
		return buf.toString();
	}
	public String addZero(int num,int len){
		StringBuffer s = new StringBuffer();
		s.append(num);
		while(s.length()<len){
			s.insert(0,"0");

		}
		return s.toString();
	}
}
public class DateDemo07{
	public static void main(String[] args){
		DateTime dt = new DateTime();
		System.out.println("系统日期 :" + dt .getDate());
		System.out.println("系统日期 :" + dt .getDateComplete());
	}
}