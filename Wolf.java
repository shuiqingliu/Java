class Animal {
    String name; 
    String food; 
    int hunger;

    void makeNoise() { }
    void eat() { }  
    void sleep() { } 
    void roam() { }  
}

class Feline extends Animal {
    void roam() {
        System.out.println("猫科动物的活动方式");
    }
}

class Lion extends Feline {
    void makeNoise() {
        System.out.println("狮子吼");
    }

    void eat() {
        System.out.println("狮子吃肉咔哧咔哧");
    }
}
//在这里设计犬科动物和狼
class Canine extends Animal{
    void roam(){
        System.out.println("犬科动物活动方式");
    }
}

public class Wolf extends Canine{
    void makeNoise(){
        System.out.println("呜呜呜");   
    }
    
    void eat(){
        System.out.println("狼吃肉");
    }
    public static void main(String[] args){
    Wolf f = new Wolf();
    f.makeNoise();
    f.eat();
    }
}

