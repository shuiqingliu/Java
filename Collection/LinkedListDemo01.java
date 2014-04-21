import java.util.LinkedList;
public class LinkedListDemo01{
	public static void main(String[] args){
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		System.out.println("1.element()方法" + link.element());
		System.out.println("2.找完之后" + link);
	}
}