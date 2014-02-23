public class ObjectDemo05{
	public static void main(String[] args) {
		int temp[] = {1,2,3,45,7,87};
		Object ob = temp;
		print(ob);
	}
	public static void print(Object obj){
		if(obj instanceof int[]){
			int x[] = (int[]) obj;
			for(int i=1;i<x.length;i++){
				System.out.print(x[i] + "\t");
			}
		}
	}
}