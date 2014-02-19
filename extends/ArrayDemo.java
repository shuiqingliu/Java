class Array{
	private int temp[];
	private int foot;
	public Array(int len){
		if(len > 0){
		this.temp = new int[len];
		}else{
			this.temp = new int[1];
		}
	}
	public boolean add(int i){
		if(this.foot < this.temp.length){
			this.temp[foot] = i;
			foot++;
			return true;
		}else{
			return false;
		}
	}
	public int[] getArray(){
		return this.temp;
	}
}
class SortArray extends Array{
	public SortArray(int len){
		super(len);
	}
	public int[] getArray(){
		java.util.Arrays.sort(super.getArray());
		return super.getArray();
	}
}
class ReverseArray extends Array{
	public ReverseArray(int len){
		super(len);
	}
	public int[] getArray(){
		int t[] = new int[super.getArray().length];
		int count = t.length - 1;
		for(int x=0;x < t.length;x++){
			t[count] = super.getArray()[x];
			count--;
		}
		return t;
	}
}
public class ArrayDemo{
	public static void main(String[] args){
		 ReverseArray a = new ReverseArray(5);
		 System.out.print(a.add(23) + "\t");
		 System.out.print(a.add(45) + "\t");
		 System.out.print(a.add(4) + "\t");
		 System.out.print(a.add(2) + "\t");
		 System.out.print(a.add(3) + "\t");
		 System.out.print(a.add(78) + "\t");
		 print(a.getArray());
	}
	public static void print(int i[]){
		for(int x = 0;x < i.length;x++){
			System.out.print(i[x] + ",");
		}
	}
}