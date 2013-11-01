public class Circle extends Shape{
	private double radius;

	public  Circle(double radius){
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
}