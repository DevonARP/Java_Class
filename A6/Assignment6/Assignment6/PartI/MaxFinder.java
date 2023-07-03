import java.util.ArrayList;

public class MaxFinder<T extends Number> {
	
	private ArrayList<T> al;
	
	public MaxFinder() {
		al = new ArrayList<T>();
	}
        
    public T max() {
    	Number dummy = al.get(0);
    	int ref = 0;
    	
    	for(int i=0; i<al.size(); i++) {
    		Number dummy2 = al.get(i);
    		if(dummy2.doubleValue()>dummy.doubleValue()) {
    			dummy = dummy2;
    			ref = i;
    		}
    		
    	}
    	T max = al.get(ref);
    	
    	
    	return max;
    }
    
    public void add(T t) {
    	
    	al.add(t);
    }
    
    public static void main (String[] args) {
            MaxFinder<Number> m = new MaxFinder<Number>();
            ComplexNumber n1 = new ComplexNumber(1,5);
            Integer a = new Integer(5);
            Double d= new Double(3.2);
            m.add(n1);
            m.add(a);;
            m.add(d);
            Number max = m.max();
            System.out.println("max for m is "+ max);
            MaxFinder<Integer> m1 = new MaxFinder<Integer>();
            Integer b = new Integer(10);
            Integer c = new Integer(20);
            m1.add(b);
            m1.add(c);
            Integer max1 = m1.max();
            System.out.println("max for m1 is "+ max1);
            
    }
        
}
