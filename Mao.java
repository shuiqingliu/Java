class Mao {
    private int size;
    private String name;

    public int getSize() { 
       return size;
    }

    public void setSize(int s) { 
       size = s;
    }

    public static void main(String[] args) {
        //在这里写代码
       int i = 0;
        Mao[] pets = new Mao[3];
        for(i = 0; i < 3;i++){
        pets[i] = new Mao();
        }
        pets[0].setSize(45);
        pets[1].setSize(23);
        pets[2].setSize(43);
        for(i = 0; i < 3; i++) {
           System.out.println("猫猫" + i +"的size是：" + pets[i].getSize());
        }
    }
}