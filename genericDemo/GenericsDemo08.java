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
public class GenericsDemo08{
	public static void main(String[] args){
		Point<Object> p = new Point<Object>();
		p.setKey("qingliu");
		System.out.println("内容:" + p.getKey());
	}
}