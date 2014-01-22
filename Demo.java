public class Demo{
	public static void main(String[] args){
		int sex[] = {67,23,86,34,100,45,77,98};
		for(int i = 0;i < sex.length;i++){
			for(int j = 0;j < sex.length;j++){
				if(sex[i] < sex[j]){
				int temp = sex[i];
				sex[i] = sex[j];
				sex[j] = temp;
				}
			}
		}
		for(int i = 0;i < sex.length;i++){
			System.out.print(sex[i] + "\t");
		}

	}
}