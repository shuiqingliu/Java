interface Windows{
	public void open();
	public void close();
	public void activated();
	public void iconified();
	public void deiconified();
}
abstract class WindowAdapter implements Windows{
	public void open(){};
	public void close(){};
	public void activated(){};
	public void iconified(){};
	public void deiconified(){};
}
class WindowImpl extends WindowAdapter{
	public void open(){
		System.out.println("打开窗口");
	}
	public void close(){
		System.out.println("关闭窗口");
	}
}
public class AdapterDemo01{
	public static void main(String[] args) {
		Windows win = new WindowImpl();
		win.open();
		win.close();
	}
}