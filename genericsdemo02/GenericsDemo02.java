interface Info<T>{
	public T getVar();
}
class InfoImpl implements Info<String>{
	private String var;
	public InfoImpl(String var){
		this.setVar(var);
	}
	public void setVar(String var){
		this.var = var;
	}
	public String getVar(){
		return this.var;
	}
}
public class GenericsDemo02{
	public static void main(String[] args){
		Info in = null;
		in = new InfoImpl("QINGLIU");
		System.out.println("内容:" + in.getVar());
	}
}