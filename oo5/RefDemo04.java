class Demo{
	private int temp = 30;
	public void fun(Demo d2){
		d2.temp = 50;
	}
	public int getTemp(){
		return temp;
	}
	public void setTmep(int t){
		temp = t;
	}
}
public class RefDemo04{
	public static void main(String[] args){
		Demo d1 = new Demo();
		d1.setTmep(50);
		d1.fun(d1);
		System.out.println("temp:" + d1.getTemp());		
	}
}