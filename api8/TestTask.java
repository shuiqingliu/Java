import java.util.Timer;
public class TestTask{
	public static void main(String[] args){
		Timer t = new Timer();
		MyTask  mt = new MyTask();
		t.schedule(mt,1000,2000);
	}
}