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
public class GenericsDemo01{
	public static void main(String[] args){
		Point p = new Point();
		p.setX(20);
		p.setY(10);
		int x = (Integer)p.getX();
		int y = (Integer)p.getY();
		System.out.println("整数表示, X坐标为" + x);
		System.out.println("整数表示, Y坐标为" + y);
	}
}