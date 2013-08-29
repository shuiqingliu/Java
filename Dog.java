public class Dog extends Mammal
{
	public void info()
	{
		System.out.println("I have " + eyes + " eyes");
	}




	public static void main(String[] args)
	{
		Dog mydog = new Dog();
		mydog.run();
		mydog.eyes = 2;
		mydog.info();
	}
}


//Mammal 类
class Mammal extends Animal
{

}


//Animal


class Animal
{
	int eyes;
	public void run()
	{
		System.out.println("I can run");
	}
}