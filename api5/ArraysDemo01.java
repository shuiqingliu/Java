import java.util.*;
public class ArraysDemo01{
	public static void main(String[] args){
		int temp[] = {3,4,5,7,9,1,2,6,8};
		Arrays.sort(temp);
		System.out.print("排序后的数组:");
		System.out.println(Arrays.toString(temp));
	}
}