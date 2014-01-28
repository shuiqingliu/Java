public class ArrayRefDemo01{
	public static void main(String[] args){
		int temp[] = {1,3,5,7};
		fun(temp);
		for(int i = 0; i < temp.length;i++){
			System.out.print(temp[i] + "、");
		}
	}
	public static void fun(int x[]){
		x[0] = 6;
	}
}