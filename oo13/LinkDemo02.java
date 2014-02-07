class Link{
	class Node{
		private String data;
		private Node next;
		public Node(String data){
			this.data = data;
		}
		public void add(Node newNode){
			if(this.next == null){
				this.next = newNode;
			}else{
				this.next.add(newNode);
			}
		}
		public void print(){
			System.out.print(this.data + "\t");
			if(this.next != null){
				this.next.print();
			}
		}
	}
	private Node root;
	public void addNode(String data){
		Node newNode = new Node(data);
		if(this.root == null){
			this.root = newNode;
		}else{
			this.root.add(newNode);
		}
	}
	public void printNode(){
		if(this.root != null){
			this.root.print();
		}
	}
}
public class LinkDemo02{
	public static void main(String[] args){
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("========= 增加之后的内容 =========");
		l.printNode();
	}
}