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
public class GenericsDemo09{
	public static void main(String[] args){
		Point<String> p = new Point<String>();
		p.setKey("qingliu");
		fun(p);
	}
	public static void fun(Point<?> temp){
		System.out.println("内容 ：" +  temp);
	}
}