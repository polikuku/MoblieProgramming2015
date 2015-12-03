
public class Node<T> {
	
	Node<T> next;
	
	T data;
	public Node(T input, Node<T> node) {
		data = input;
		next = node;
        }
	public T getData() {
		return data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> Node) {
	   next = Node;
	}


}
