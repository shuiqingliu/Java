public class VarCasting {
    public static void main(String[] args) {
    long max = 3000;
    //在这里将long转换成short然后打印出来看看结果
     System.out.println((short)max);
    float f = 5.123f;
    //在这里将float转换成int然后打印出来看看结果
        System.out.println((int)f);
    String num = "23";
    //在这里将String转换成int然后打印出来看看结果
        System.out.println(Integer.parseInt(num));
    }
}