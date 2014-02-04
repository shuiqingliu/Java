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
public class SingletonDemo05{
	public static void main(String[] args){
		Singleton s1 = null;
		Singleton s2 = null;
		Singleton s3 = null;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		s3 = Singleton.getInstance();
		s1.print();
		s2.print();
		s3.print();
	}
}