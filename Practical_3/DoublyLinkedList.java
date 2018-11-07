import java.util.Iterator;
/*
 * Code written by SURABHI AGARWAL, 17203535
 * References used : Data Structures and Algorithms by Goodrich Et Al
 * 
 */


public class DoublyLinkedList<E>implements List<E>{
	
	//nested node class
	
	private static class Node<E>{
		private E element;
		private Node<E> prev;
		private Node<E> next;
		
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
		
		public E getElement() {
			return element;
		}
		public Node<E>getPrev(){
			return prev;
		}
		public Node<E> getNext(){
			return next;
		}
		public void setPrev(Node<E>p) {
			prev = p;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
	/*
	 * Instance variables for the Doubly linkedList
	 */
	
	private Node<E> header;
	private Node<E> trailer;
	private int size = 0;
	
	/* 
	 * Constructing an empty doubly linked list
	 */
	public DoublyLinkedList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}

	/*
	 * Accessor methods:
	 * 1. Returning the size of the list
	 * 2. The first element of the list
	 * 3. Last element of the list
	 */
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
		
	}
	
	public E first() {
		if(isEmpty()) {
			return null;
		}
		
		return header.getNext().getElement();
	}
	
	public E last() {
		if(isEmpty()) {
			return null;
		}
		return trailer.getPrev().getElement();
	}
	
	/* Mutator methods to:
	 * 1. Add element to the first position of the list
	 * 2. Add element to the end of the list
	 * 3. Remove the first element
	 * 4. Remove the last 
	 */
	
	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		return remove(header.getNext());
	}
	
	public E removeLast() {
		if(isEmpty()) {
			return null;
		}
		return remove(trailer.getPrev());
	}
	
	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		
		Node<E>newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(predecessor);
		size--;
	}
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement();
	}
	
	private class ListIterator<T> implements Iterator<T> {

		@SuppressWarnings("unchecked")
		Node<T> curr = (Node<T>) header.getNext();

		@Override
		public boolean hasNext() {
			return curr != trailer;
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

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int i, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
