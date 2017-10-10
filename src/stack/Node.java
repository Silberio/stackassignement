package stack;

public class Node<E> {
	
	private Node<E> next;
	private E value;
	//this represents nodes in the stack
	
	public Node() {
		value = null;
	};
	
	public Node(E value, Node<E> next) {
		this.value = value;
		this.next = next;
	}
	
	/**Returns the next node*/
	public Node<E> getNext(){
		//returns next node in line after whatever node is selected
		return next;
	}
	
	/**Sets next node*/
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**Gets the value (data) of a node*/
	public E getValue() {
		return value;
	}
	
	/**Sets the value for a node (data)*/
	public void setValue(E value) {
		this.value = value;
	}

}
