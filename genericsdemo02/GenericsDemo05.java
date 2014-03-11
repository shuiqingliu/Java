class Info <T>{
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
public class GenericsDemo05{
	public static void main(String[] args){
		Info<String> i1 = new Info<String>();
		Info<String> i2 = new Info<String>();
		i1.setVar("QINGLIU");
		i2.setVar("30");
		add(i1,i2);
	}
	public static <T> void add(Info<T> i1,Info<T> i2){
		System.out.println(i1.getVar() + ", " + i2.getVar());
	}
}