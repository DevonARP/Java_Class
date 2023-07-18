package PartI;
import java.util.ArrayList;


public class MyStack<E> {

	private ArrayList<E> ar;
	
	public MyStack() {
		ar = new ArrayList<E>();
	}
	
	public boolean empty() {
		if (ar.size()>0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public E peek() {
		if (this.empty() == false) {
			return ar.get(0);
		}
		else {
			return null;
		}
	}
	
	public E pop() {
		if (this.empty() == false) {
			E x = ar.get(0);
			ar.remove(0);
			return x;
		}
		else {
			return null;
		}
	}
	
	public void push(E item) {
			ar.add(0,item);
	}
	
	public int search(Object obj) {
		if (this.empty() == false) {
			for(int i=0; i<= ar.size(); i++) {
				if(obj == ar.get(i)) {
					return i;
				}
			}
		}
		return -1;
	}
	
}
