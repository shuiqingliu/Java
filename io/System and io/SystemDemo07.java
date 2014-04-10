import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class SystemDemo07{
	public static void main(String[] args) throws Exception{
		ByteArrayOutputStream bos = null;
		bos = new ByteArrayOutputStream();
		System.setErr(new PrintStream(bos));
		System.err.print("wwww.shuiqingliu.com");
		System.err.println("qingliu");
		System.out.println(bos);
	}
}