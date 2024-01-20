package co.in.rays.PracticeCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		ArrayList set = new ArrayList();
		
		set.add("Sourabh");
		set.add(20);
		set.add(55.55);
		set.add(true);
		set.add(null);
		set.add(3.3);
		set.add("Sourabh");
		
		
		System.out.println(set);
		
		HashSet s =new HashSet(set);
		
		System.out.println(s);
		
		boolean flag = s.add("Muskan");
		
		System.out.println(flag);
		
		 boolean flag1 = s.add("Muskan");
		
		System.out.println(flag1);
		
		s.clone();
		
		System.out.println(s);
		
		s.clear();
		
		s.containsAll(s);
		
		System.out.println(s);

		HashSet s1 = new HashSet();
		
		s1.isEmpty();
		
		System.out.println(s1);
		
		
		
		
		
		

					
	 
	}
}
