package PartIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SortFrequency {
	
	//There are numbers that aren't sorted because the HashMap isn't in any actual order
	//To overcome this, I put the keys and values into their own arrays with the index corresponding to each other
	//From here, you can just iterate through the values and just grab the indexes to get it in order

	public static void sortByFrequency(ArrayList<Integer> ar) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for (int key: ar) {
			int count = m.getOrDefault(key, 0);
			m.put(key, count + 1);
		}
		
		ar.clear();
		ArrayList<Integer> k = new ArrayList<Integer>();
		ArrayList<Integer> v = new ArrayList<Integer>();
		
        for (Integer key: m.keySet()){
            System.out.println(key +" = "+m.get(key));
        }
		
      //Due to how I'm reading the data, having the data inserted at the head of the array makes the order
      //between keys of the same value ascending
		for (Integer key: m.keySet()){ 
			k.add(0,key);
			v.add(0,m.get(key));
        }
		
		//System.out.println(Arrays.deepToString(k.toArray()));
		//System.out.println(Arrays.deepToString(v.toArray()));
		
		while(k.size() != 0) {
			int max = 0;
			int index = 0;
			for (int j = 0; j<v.size();j++) {
				if (v.get(j)>max) {
					max = v.get(j);
					index = j;
				}
				
			}
			ar.add(0,k.get(index));
			k.remove(index);
			v.remove(index);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i=0;i<100;i++) {
			ar.add((int)(Math.random()*10));			
		}
		System.out.println(ar.toString());
		sortByFrequency(ar);
		System.out.println(ar.toString());
	}
}
