package PartI;

import java.util.ArrayList;

public class BalancedParentheses {

	public static boolean isBalanced(String inString) {
		
		MyStack<Character> m = new MyStack<Character>();
		
		for (int i = inString.length()-1; i >= 0 ; i--) {
			char x = inString.charAt(i);
			//System.out.println(inString.charAt(i));
			m.push(x);
        }
		
		ArrayList<Character> start = new ArrayList<Character>();
		
		if(m.peek()=='(') {
			start.add(m.pop());
		}
		else if(m.peek()==')') {
			return false;
		}
		
		while(m.empty() == false) {
			if(m.peek()==')') {
				m.pop();
				start.remove(start.size() - 1);
			}
			else if (m.peek() == '(') {
				start.add(m.pop());
			}
		}
		
		if(start.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean result = isBalanced("(()()()())"); //true
		System.out.println(result);
		result = isBalanced("(((())))"); //true
		System.out.println(result);
		result = isBalanced("((((((())"); //false
		System.out.println(result);
	}
}
