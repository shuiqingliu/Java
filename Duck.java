public class Duck{
	String name;

	public static void main(String[] args){
		Duck duck = new Duck();
		duck.name = "petty";
		duck.bark();

		Duck[] myDuck = new Duck[3];
		myDuck[0] = new Duck();
		myDuck[1] = new Duck();
		myDuck[2] = duck;



		myDuck[0].name = "kitty";
		myDuck[1].name = "maomao";

		System.out.println(" 最后一只鸭子的名字是： ");
		System.out.println(myDuck[2].name);


		int i = 0;
		while(i < myDuck.length){
			myDuck[i].bark();
			i = i + 1;
		}
	}

	public void bark(){
		System.out.println("鸭子咬了一下");
	} 
}