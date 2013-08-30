public class Frog {
    public static void main(String[] args) {
        int frogNum = 1;
        int frogLegs = 0;
        int frogEyes = 0;
        
        while (frogNum <= 10) {
            
            //请在这里编写蛤蟆的歌谣
            frogLegs = 4 * frogNum;
            frogEyes = 2 * frogNum;
            System.out.println(frogNum + " 只蛤蟆 " + frogLegs + " 条腿 ");
            System.out.println(frogEyes + " 只眼睛 " + frogNum + " 张嘴 ");
            
            int i = 1;
            while(i <= frogNum){
                System.out.println("扑通");
                i++;
            }
            System.out.println("跳下水");
            
            
            frogNum = frogNum + 1;
            if (frogNum > 10) {
                int temp = frogNum - 1;
                System.out.println(temp + "只蛤蟆的歌谣唱完了！");
            } else {
                System.out.println("蛤蟆的歌谣还在继续！");
            }
        }
    }
}