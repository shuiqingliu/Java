class Animal {
    void makeNoise() {
        System.out.println("动物在嘶吼！");
    }
}

class Dog extends Animal {
}

class Vet {
    public void giveShot(Animal a) {
        a.makeNoise();
    }
}

public class PetOwner {
    void start() {
        Vet v = new Vet();
        Dog d = new Dog();
        v.giveShot(d);
    }
    
    public static void main(String[] args) {
        //在这里写代码
        PetOwner p = new PetOwner();
        p.start();
    }
}