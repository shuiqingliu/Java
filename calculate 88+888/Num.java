public class Num{
	public static void main(String[] args){
		long i = 1,s = 8,a = s,sum = 0;
		for(i = 1 ; i <= 10 ; i++){
			sum = sum + a;
			a = a*10 + s;
		}
		System.out.println(sum);
	}
}