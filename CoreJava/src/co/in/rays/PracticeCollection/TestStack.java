package co.in.rays.PracticeCollection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push("Sourabh");
		s.push("Mandloi");
		s.push(5);
		s.push('s');
		
		System.out.println(s);
		
		Object o = s.pop();
		System.out.println(o);
		System.out.println(s);
		
		
		Object p = s.peek();
		System.out.println(p);
		System.out.println(s);
		
		
		boolean b = s.empty();
		
		System.out.println(b);
		
		
		int i = s.search("Sourabh");
		
		System.out.println(i);
		
		

		
	}
}
