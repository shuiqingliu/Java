class Point<T>{
	private T x;
	private T y;
	public void setX(T x){
		this.x = x;
	}
	public void setY(T y){
		this.y = y;
	}
	public T getX(){
		return this.x;
	}
	public T getY(){
		return this.y;
	}
}
public class GenericsDemo04{
	public static void main(String[] args){
		Point<String> p = new Point<String>();
		p.setX("东经180°");
		p.setY("北纬42°");
		String x = p.getX();
		String y = p.getY();
		System.out.println("字符串表示, X坐标为" + x);
		System.out.println("字符串表示, Y坐标为" + y);
	}
}