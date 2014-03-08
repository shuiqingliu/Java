class Point<T>{
	private T var;
	public Point(T var){
		this.var = var;
	}
	public void setVar(T var){
		this.var = var;
	}
	public T getVar(){
		return this.var; 
	}
}
public class GenericsDemo05{
	public static void main(String[] args){
		Point<String> p = new Point<String>("qingliu");
		System.out.println("字符串:" + p.getVar());
	}
}