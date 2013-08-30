public class Cat {
    String name;
    
    public static void main(String[] args) {
        //在这里写代码
        Cat d = new Cat();
        d.name = "小李子";
        d.bark();
        d.eat();
    
    }
    
    public void bark() {
        System.out.println(name + " is barking!");
    }
    
    public void eat() {
        System.out.println(name + " is eating!");
    }
}