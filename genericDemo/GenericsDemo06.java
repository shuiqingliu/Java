class Point<K,V>{
	private K key;
	private V value;
	public void setKey(K key){
		this.key = key;
	}
	public K getKey(){
		return this.key; 
	}
	public void setValue(V value){
		this.value = value;
	}
	public V getValue(){
		return this.value;
	}
}
public class GenericsDemo06{
	public static void main(String[] args){
		Point<String,Integer> p = new Point<String,Integer>();
		p.setKey("qingliu");
		p.setValue(20);
		System.out.println("key:" + p.getKey() + "value:" +p.getValue());

	}
}