class Singleton{
	static Singleton instance = new Singleton();
	private Singleton(){

	}
	public void print(){
		System.out.println("Hello World!!!");
	}
}
public class SingletonDemo03{
	public static void main(String[] args){
		Singleton s1 = null;
		s1 = Singleton.instance;
		s1.print();
	}
}