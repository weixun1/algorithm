package linkedlistimpl;

public class Node {
	public int val;
	public Node next;
	
	
	
	
	public Node() {
		super();
	}
	public Node(int val, Node next) {
		super();
		this.val = val;
		this.next = next;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
