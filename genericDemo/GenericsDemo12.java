class Point<K>{
	private K key;
	public void setKey(K key){
		this.key = key;
	}
	public K getKey(){
		return this.key; 
	}
	public String toString(){
		return this.key.toString();
	}
}
public class GenericsDemo12{
	public static void main(String[] args){
		Point<String> p1 = new Point<String>();
		Point<Object> p2 = new Point<Object>();
		p1.setKey("qingliu");
		p2.setKey(new Object());
		fun(p1);
		fun(p2);
	public static void fun(Point<? super String> temp){
		System.out.println(temp + "、");
	}
}