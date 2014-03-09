class Point<K extends Number>{
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
public class GenericsDemo11{
	public static void main(String[] args){
		Point<Integer> p1 = new Point<Integer>();
		p1.setKey(20);
		System.out.println(p1.getKey());
	}
}