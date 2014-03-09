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
public class GenericsDemo10{
	public static void main(String[] args){
		Point<Integer> p1 = new Point<Integer>();
		Point<Float> p2 = new Point<Float>();
		p1.setKey(20);
		p2.setKey(45.5f);
		fun(p1);
		fun(p2);
	}
	public static void fun(Point<? extends Number> temp){
		System.out.print(temp + ",");
	}
}