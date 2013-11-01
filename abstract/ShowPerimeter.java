public class ShowPerimeter{
	public static void main(String[] args){
		Shape s1 = new Circle(13.05);
		Shape s2 = new Square(20.89);
		
		System.out.println("圆的周长是" + s1.perimeter());
		System.out.println("正方形的周长是" + s2.perimeter());
	}
}