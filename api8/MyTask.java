import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.util.Date;
class MyTask extends TimerTask{
	public void run(){
		SimpleDateFormat spf = null;
		spf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		System.out.println("当前系统时间为：" + spf.format(new Date()));
	}
}