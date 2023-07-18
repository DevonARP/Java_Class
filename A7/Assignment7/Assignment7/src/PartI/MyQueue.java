package PartI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<E> implements Queue<E> {
	
	private ArrayList<E> ar;

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (ar.size()>0) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ar.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E element() {
		if (this.isEmpty() == false) {
			return ar.get(0);
		}
		else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public boolean offer(E e) {
			ar.add(e);
			return true;
	}

	@Override
	public E peek() {
		if (this.isEmpty() == false) {
			return ar.get(0);
		}
		else {
			return null;
		}
	}

	@Override
	public E poll() {
		if (this.isEmpty() == false) {
			E x = ar.get(0);
			ar.remove(0);
			return x;
		}
		else {
			return null;
		}
	}

	@Override
	public E remove() {
		if (this.isEmpty() == false) {
			E x = ar.get(0);
			ar.remove(0);
			return x;
		}
		else {
			throw new NoSuchElementException();
		}
	}
	
}
