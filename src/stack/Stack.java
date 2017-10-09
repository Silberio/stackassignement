package stack;

import java.util.*;

public class Stack<T>{
	private T type;
	private Node node, nextNode;
	/*
	 * METHODS
	 * 
	 */
	public Stack() {
		node = null;
	}

	/** Inserts an element to the top of the stack */
	public void push(T item) {
		type = item;
		nextNode = node;
		node = new Node();
		node.setValue(type);
		node.setNext(nextNode);

		// throws exception nullpointerexcept if its null
	}

	/** removes top most element */
	public T pop() {
		// throws emptystackexcept if stack is empty
		node = nextNode;
		
		
		return type;
	}

	/** returns top-most element without removing it from the stack */
	public T peek() {
		return type;
		// throws emptystackexcept if its empty
	}

	/** checks if the stack is empty */
	public boolean isEmpty() {
		boolean isEmpty = false;
		// true if stack is empty. false if it's not
		return isEmpty;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

	// ##### MAIN METHOD #####
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		
		myStack.push("ela");
		myStack.push("noob");
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}

}
