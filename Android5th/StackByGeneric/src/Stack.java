
public class Stack<T> {
    Node<T> node;
	
    public void push(T input) {
		Node<T> nNode = new Node<T>(input, node);
		if( node == null){
			node= nNode;
			nNode.setNext(null);
			
		}
		else{
			nNode.setNext(node);
			node = nNode;
		}
	}
    
	public T  pop() {
		T out = node.getData();
		Node<T> temp = node;
		node = node.next;
		temp = null;
		return out;

	}
	
	


}
