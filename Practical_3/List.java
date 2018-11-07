

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
	
	boolean isEmpty();
	int size();
	Iterator<E> iterator();
	
	E get(int i);
	void set(int i, E e);
	void add(int i, E e);
	E remove(int i);
	
}

//All your lists should implement this list interface
