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
public class GenericsDemo02{
	public static void main(String[] args){
		Point p = new Point();
		p.setX(20.5f);
		p.setY(10.3f);
		float x = (Float)p.getX();
		float y = (Float)p.getY();
		System.out.println("小数表示, X坐标为" + x);
		System.out.println("小数表示, Y坐标为" + y);
	}
}