class Node{
	private String date;
	private Node next;
	public Node(String date){
		this.date = date;
	}
	public void setNext(Node next){
		this.next = next;
	}
	public Node getNext(){
		return this.next;
	}
	public String getDate(){
		return this.date;
	}
}
public class LinkDemo01{
	public static void main(String[] args){
		Node root = new Node("火车头");
		Node n1 = new Node("车厢-A");
		Node n2 = new Node("车厢-B");
		Node n3 = new Node("车厢-C");
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		printNode(root);
	}
	public static void printNode(Node node){
		System.out.print(node.getDate() + "\t");
		if(node.getNext() != null){
			printNode(node.getNext());
		}
	}
}