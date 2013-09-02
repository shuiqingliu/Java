class GoodDog {
    private int size;
    
    //在这里写代码
    public int getSize(){
        return size;
    }
    
    public void setSize(int s){
        size = s;
    }
    
    void bark() {
        if (size > 60) {
            System.out.println("汪汪汪汪汪汪！");
        } else if (size > 14) {
            System.out.println("汪汪汪汪！"); 
        } else {
            System.out.println("喔喔！");
        }
    }
}

public class GoodDogTestDrive {
    public static void main(String[] args) { 
        GoodDog one = new GoodDog(); 
        one.setSize(70);
        
        GoodDog two = new GoodDog(); 
        two.setSize(8);
        
        System.out.println("Dog one:" + one.getSize());
        System.out.println("Dog two:" + two.getSize());
        
        one.bark(); 
        two.bark();
    }
}