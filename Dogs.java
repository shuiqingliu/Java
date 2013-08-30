public class Dogs{
	public void bark(){
		System.out.println("I can bark!");
	}

	public static void main(String[] args){
		int i = 1;
		
		Dogs[] myDogs = new Dogs[7];
		for(i = 1;i < 7;i++){
			myDogs[i] = new Dogs();
			myDogs[i].bark();
		}
	}

}