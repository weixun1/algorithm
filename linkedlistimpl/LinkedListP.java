package linkedlistimpl;

public class LinkedListP {

	Node node = null;

	
	public void add(Integer i) {
		
		Node newN = new Node(i,null);
		newN.setNext(null);
		
		
		
		if(this.node == null) {
			this.node = new Node(i,null);
		}
		else
		{
			
			while(this.node.getNext() !=null) {
				this.node = this.node.getNext();
			}
			this.node.next = newN;
		}
		

	}
	

	public String getAll() {
		return getAll(this.node);
	}
	
	public String getAll(Node n) {
		if(n.getNext() != null) {
			return n.getVal()+","+getAll(n.next);

		}
		else
		{
			return Integer.toString(n.getVal());
		}
	}
	
	
	
	
	public void print() {
		
		System.out.println(getAll());
	}
	
	
	
	
	
	
}
