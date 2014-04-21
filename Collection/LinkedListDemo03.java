import java.util.LinkedList;
public class LinkedListDemo03{
	public static void main(String[] args){
		LinkedList<String> link = new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		System.out.println("通过FIFo方法");
		for(int i =0;i < link.size()+1;i++){
			System.out.print(link.poll() + "、");
		}
	}
}