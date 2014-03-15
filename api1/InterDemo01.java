import java.util.ResourceBundle;
public class InterDemo01{
	public static void main(String[] args){
		ResourceBundle rb = ResourceBundle.getBundle("Message");
		System.out.println("内容:" + rb.getString("info"));

	}
}