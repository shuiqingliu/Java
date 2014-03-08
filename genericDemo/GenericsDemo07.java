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
public class GenericsDemo07{
	public static void main(String[] args){
		Point p = new Point();
		p.setKey("qingliu");
		System.out.println("内容:" + p.getKey());
	}
}