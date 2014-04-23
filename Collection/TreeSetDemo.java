import java.util.TreeSet;
import java.util.Set;
public class TreeSetDemo{
	public static void main(String[] args){
		Set<String> allSet = new TreeSet<String>();
		allSet.add("C");
		allSet.add("D");
		allSet.add("B");
		allSet.add("A");
		allSet.add("A");
		allSet.add("B");
		System.out.println(allSet);
	}
}