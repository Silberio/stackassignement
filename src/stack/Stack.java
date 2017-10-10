package stack;

import java.util.*;

public class Stack<T>{
	private T type;
	private Node<T> top;
	/*
	 * METHODS
	 * 
	 */
	public Stack() {
		top = null;
	}

	/** Inserts an element to the top of the stack */
	public void push(T item) {
		Node<T> oldTop = top;
		top = new Node<T>(item, oldTop);

		// throws exception nullpointerexcept if its null
	}

	/** removes top most element */
	public T pop() {
		type = top.getValue();
		top = top.getNext();
		return type;
	}

	/** returns top-most element without removing it from the stack */
	public T peek() {
		return type;
		// throws emptystackexcept if its empty
	}

	/** checks if the stack is empty */
	public boolean isEmpty() {
		return top == null;
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
