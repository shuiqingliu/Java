class Animal {
    String name;
    String food;
    int hunger;

    void makeNoise() { }
    void eat() { }
    void sleep() { }
    void roam() { }
}

class Canine extends Animal {
    void roam() {
        System.out.println("犬科动物的活动方式");
    }
}

public class Wolf extends Canine {
    void makeNoise() {
        System.out.println("呜呜呜...");
    }

    void eat() {
        System.out.println("狼吃肉，好恐怖！");
    }

    public static void main(String[] args) {
        //在这里写代码
        Wolf f = new Wolf();
            f.makeNoise();
            f.eat();
            f.roam();
            f.sleep();
            
        
    }
}