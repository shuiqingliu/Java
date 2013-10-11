public class Sum{
	public static void main(String[] args){
  		int y = 0;
	 	int i = 1;
		while(i <= 1000){
			if(i%3 == 0 && i%7 == 0){
				y = y + i;
			}
			i++;
		}

		System.out.println(y);
	}
		
}
