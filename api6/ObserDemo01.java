import java.util.*;
class House extends Observable{   //表示房子可被观察
	private float price;
	public House(float price){
		this.price = price;
	}
	public float getPrice(){
		return this.price;
	}
	public void setPrice(float price){
		//每次修改引起观察者注意
		super.setChanged();    //设置变化点
		super.notifyObservers(price);   //价格被被改动
		this.price = price;
	}
	public String toString(){
		return "房子价格为：" + this.price;
	}
}
class HousePriceObserver implements Observer{
	private String name;
	public HousePriceObserver(String name){    //设置每一位观察者的姓名
		this.name = name;
	}
	public void update(Observable o,Object arg){
		if(arg instanceof Float){
			System.out.print(this.name + "观察到价格更改为:");
			System.out.println(arg);
		}
	}
}
public class ObserDemo01{
	public static void main(String[] args){
		House h = new House(10000000);
		HousePriceObserver hop1 = new HousePriceObserver("购房者A");
		HousePriceObserver hop2 = new HousePriceObserver("购房者B");
		HousePriceObserver hop3 = new HousePriceObserver("购房者C");
		h.addObserver(hop1);
		h.addObserver(hop2);
		h.addObserver(hop3);
		System.out.println(h);
		h.setPrice(600000);
		System.out.println(h);
	}
}

