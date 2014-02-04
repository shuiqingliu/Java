class Singleton{
	private static Singleton instance = new Singleton();
	public static Singleton getInstance(){
		return instance;
	}
	private Singleton(){

	}
	public void print(){
		System.out.println("Hello World!!!");
	}
}
public class SingletonDemo04{
	public static void main(String[] args){
		Singleton s1 = null;
		s1 = Singleton.getInstance();
		s1.print();
	}
}