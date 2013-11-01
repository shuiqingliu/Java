public class Square extends Shape{
	private double length;

	public Square(double length){
		this.length = length;
	}
	public void setLength(double length){
		this.length = length;
	}

	public double perimeter(){
		return 4 * length;
	}
}
