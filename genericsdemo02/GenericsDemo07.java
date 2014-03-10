class Info<T,V>{
	private T t;
	private V v;
	public Info(T t,V v){
		this.setT(t);
		this.setV(v);
	}
	public void setT(T t){
		this.t = t;
	}
	public void setV(V v){
		this.v = v;
	}
	public T getT(){
		return this.t;
	}
	public V getV(){
		return this.v;
	}
}
class Demo<S>{
	private S info;
	public Demo(S info){
		this.setInfo(info);
	}
	public void setInfo(S info){
		this.info = info;
	}
	public S getInfo(){
		return this.info;
	}
}
public class GenericsDemo07{
	public static void main(String[] args){
		Demo<Info<String,Integer>> d = null;
		Info<String,Integer> i = null;
		i = new Info<String,Integer>("qingliu",21);
		d = new Demo<Info<String,Integer>>(i);
		System.out.println(d.getInfo().getT());
		System.out.println(d.getInfo().getV());
	}
}