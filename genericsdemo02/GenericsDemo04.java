class Info <T extends Number>{
	private T var;
	public void setVar(T var){
		this.var = var;
	}
	public T getVar(){
		return this.var;
	}
	public String toString(){
		return this.var.toString();
	}
}
public class GenericsDemo04{
	public static void main(String[] args){
		Info<Integer> i = fun(30);
		System.out.println(i.getVar());
	}
	public static <T extends Number> Info<T> fun(T pre){
		Info<T> temp = new Info<T>();
		temp.setVar(pre);
		return temp;
	}
}