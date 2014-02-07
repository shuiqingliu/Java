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
		public boolean search(String data){
			if(data.equals(this.data)){
				return true;
			}else{
				if(this.next != null){
					return this.next.search(data);
				}else{
					return false;
				}
			}
		}
		public void delete(Node previous,String data){
			if(data.equals(this.data)){
				previous.next = this.next; 
			}else{
				if(this.next != null){
					this.next.delete(this,data); 
				}
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
	public boolean contains(String name){
		return this.root.search(name);
	}
	public void deleteNode(String data){
		if(this.contains(data)){
			if(this.root.equals(data)){
				this.root = this.root.next;
			}else{
				this.root.next.delete(root,data);
			}
		}
	}
}
public class LinkDemo04{
	public static void main(String[] args){
		Link l = new Link();
		l.addNode("A");
		l.addNode("B");
		l.addNode("C");
		l.addNode("D");
		l.addNode("E");
		System.out.println("========= 删除之前 =========");
		l.printNode();
		//System.out.println(l.contains("C"));
		l.deleteNode("D");
		l.deleteNode("E");
		l.deleteNode("B");
		System.out.println("\n======== 删除之后 =======");
		l.printNode();
		System.out.println("查询节点:" + l.contains("B"));
	}
}