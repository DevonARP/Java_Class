package PartII;
import java.util.HashSet;
import java.util.Set;

public class MathSet<E> extends HashSet<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Set<E> intersection(Set<E> s2) {
		MathSet<E> result = new MathSet<E>();
		result.addAll(this);
		result.retainAll(s2);
		return result;
	}
	
	public Set<E> union(Set<E> s2) {
		MathSet<E> result = new MathSet<E>();
		result.addAll(this);
		result.addAll(s2);
		return result;
	}
	
	public <T> Set<Pair<E,T>> cartesianProduct(Set<T> s2) {
		MathSet<Pair<E,T>> result = new MathSet<Pair<E,T>>();
		for (E s1 : this) {
			for (T s : s2) {
				Pair<E,T> dummy = new Pair<E, T>(s1, s);
				result.add(dummy);
			}
		}
		
		return result;

	}
	
	public static void main(String[] args) {
		MathSet<Integer> s1 = new MathSet<Integer>();
		MathSet<Integer> s2 = new MathSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s2.add(4);
		s2.add(5);
		s2.add(6);
		s2.add(2);
		System.out.println(s1.intersection(s2));
		System.out.println(s1.union(s2));
		System.out.println(s1.cartesianProduct(s2));
		
		
	}
}
