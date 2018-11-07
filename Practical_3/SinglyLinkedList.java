import java.util.Iterator;

/*
 * Code written by SURABHI AGARWAL, 17203535
 * References used : Data Structures and Algorithms by Goodrich Et Al
 * 
 */

public class SinglyLinkedList<E> implements Iterable<E> {
	
	/*
	 * Nested node class containing:
	 * 1. reference to the element stored at the node
	 * 2. reference to the subsequent node in the list
	 */
	private static class Node<E>{
		private E element;
		private Node<E>next;
		/*
		 * Constructor definition
		 * Accepting a new element to create a node
		 */
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		/* 
		 * Definition of accessor and mutator methods:
		 * 1. To return the element desired
		 * 2. To return the node desired
		 * 3. To set the next node as the node passed
		 */
		public E getElement() {
			return element;
		}
		public Node<E>getNext(){
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	
	/* 
	 * Instance variables of linkedList class:
	 * 1. Head node of the list
	 * 2. Last node i.e Tail of the list
	 * 3. Size determines the number of nodes in the list
	 */
	
	private Node<E>head = null;
	private Node<E>tail = null;
	private int size = 0;
	
	/*
	 * A Default constructor to construct an empty list
	 */
	public SinglyLinkedList() {
		//empty list
	}
	
	/*
	 * Accessor methods:
	 * 1. To return the size of the list
	 * 2. To determine if the list is empty
	 */
	public int size() {
		return size;
	}
    
	public boolean isEmpty() {
		return size == 0;
	}
	
	/*
	 * the two Methods to return:
	 * 1. the first element of the list
	 * 2. Last element of the list
	 */
	public E first() {
		if(isEmpty()) {
			return null;
		}
		
		return head.getElement();
	}
	
	public E last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	
	/*
	 * Mutator methods to:
	 * 1. Ass the first element of the list
	 * 2. Adding an element to the last position
	 * 3. Removing an element from the lsit
	 */
	
	public void addFirst(E e) {
		head = new Node<>(e, head);
		
		if(size == 0) { //If the list has size as O then 
			tail = head; //tail is the head node
			size++;
		}
	}
	
	public void addLast(E e) {
		Node<E>newest = new Node<>(e, null);
		
		if(isEmpty()) {
			head = newest;
		} else {
			tail.setNext(newest); //New node becomes the tail
			tail = newest;        
			size++;
		}
	}
	
	public E removeFirst() {
		if(isEmpty())    //If the list is empty, we do not remove anything
			return null;
		E answer = head.getElement(); 
		head = head.getNext();
		size--;
		  if(size == 0) 
			tail = null;
			return answer;
	
}
	
	// this method implements the Iterable interface, but we
		// need a new object to keep
	
		private class ListIterator<T> implements Iterator<T> {

			@SuppressWarnings("unchecked")
			Node<T> curr = (Node<T>) head;

			@Override
			public boolean hasNext() {
				return curr != null;
			}

			@Override
			public T next() {
				T val = curr.getElement();
				curr = curr.getNext();
				return val;
			}
		}
	
		  @Override
			public Iterator<E> iterator() {
				return new ListIterator<E>();
			}
		   
	

}

