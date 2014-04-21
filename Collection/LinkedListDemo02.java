import java.util.LinkedList;
public class LinkedListDemo02{
	public static void main(String[] args){
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		System.out.println("1-1.element()方法" + link.element());
		System.out.println("2-1.找完之后" + link);
		System.out.println("2-1.peek()方法" + link.peek());
		System.out.println("2-1.找完之后" + link);
		System.out.println("3-1.poll()方法" + link.poll());
		System.out.println("3-2.找完之后" + link);
	}
}