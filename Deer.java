public class Deer 
{
	int eyes = 2;
	int ears = 2;
	int legs = 4;

	void run()
	{
		System.out.println("I can run");
	}

	void drink() 
	{
		System.out.println("I can drink");
	}

	void eat() 
	{
		System.out.println("I can eat");
	}

	void info() 
	{
		System.out.println("I have" + eyes + " eyes and " 
			+ ears + " ears and " + legs + " legs " );

	}
	public static void main(String[] args)
	{
		Deer deer = new Deer();
		deer.run();
		deer.drink();
		deer.eat();
		deer.info();
	}
}