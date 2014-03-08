class Point{
	private Object x;
	private Object y;
	public void setX(Object x){
		this.x = x;
	}
	public void setY(Object y){
		this.y = y;
	}
	public Object getX(){
		return this.x;
	}
	public Object getY(){
		return this.y;
	}
}
public class GenericsDemo03{
	public static void main(String[] args){
		Point p = new Point();
		p.setX("东经180°");
		p.setY("北纬42°");
		String x = (String)p.getX();
		String y = (String)p.getY();
		System.out.println("字符串表示, X坐标为" + x);
		System.out.println("字符串表示, Y坐标为" + y);
	}
}