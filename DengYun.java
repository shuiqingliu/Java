public class Tiger {
    String name;
    public static void main(String[] args) {
        Tiger dog1 = new Tiger();
        dog1.name = "旺财";
        dog1.bark(3);
    }
    //在这里写代码
    public void bark(int numOfBarks){
        System.out.println(" 我叫了 " + numOfBarks + " 声");
    }
}