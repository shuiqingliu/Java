public class Secret {
    
    int giveSecret() {
        return 42;
    }
    
    public static void main(String[] args) {
        //在这里写代码 
        Secret s = new Secret();
        int theSecret = s.giveSecret();
        System.out.println("你的密码" + theSecret);
    }   
}