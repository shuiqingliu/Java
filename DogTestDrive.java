class Dog {    
    int size;
	String name;

	void bark() {
		if (size > 60) {
			System.out.println("汪汪汪汪汪汪！"); 
		} else if (size > 14) {
			System.out.println("汪汪汪！");
		} else {
			System.out.println("喔喔喔！");
        }
	}
}

public class DogTestDrive {
    public static void main (String[] args) {
        //在这里写代码
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        
        d1.size = 100;
        d2.size = 20;
        d3.size = 1;
        
        d1.bark();
        d2.bark();
        d3.bark();
    }
}