public class ArrayDemo01{
	public static void main(String[] args){
		int score[][] = new int[4][3];
		score[0][1] = 30;
		score[1][0] = 70;
		score[2][2] = 34;
		score[3][1] = 3;
		score[1][1] = 59;
		for(int i = 0;i < score.length;i++){
			for (int j = 0;j < score[i].length;j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}