public class ArrayRefDemo03{
	public static void main(String[] args){
		int score[] = {67,89,87,69,90,100,75,90};
		int age[] = {31,30,18,8,9,1,39};
		sort(score);
		print(score);
		System.out.println("\n---------------------------------");
		sort(age);
		print(age);
	}
	public static void sort(int temp[]){
		for(int i = 0;i < temp.length;i++){
			for(int j = 0;j < temp.length;j++){
				if(temp[i] < temp[j]){
					int x = temp[i];
					temp[i] = temp[j];
					temp[j] = x;
				}
			}
		}
	}
	public static void print(int temp[]){
		for(int i = 0;i < temp.length;i++){
			System.out.print(temp[i] + "\t");
		}
	}
}