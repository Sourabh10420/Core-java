package co.in.rays.PracticeCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionInterface {
	
		public static void main(String[] args) {
			
			ArrayList a =new ArrayList(); // object create
			
			a.add("Rays");
			a.add(10);
			a.add(true);
			a.add('a');
			a.add("Rays");
		
			System.out.println(a);
			
			ArrayList a1 = new ArrayList(); // new object create
				
				a1.addAll(a);
				a1.add("Sourabh");
				
				System.out.println(a1);
				
		 	a1.remove("Rays"); // remove specific element first occurness
			
				System.out.println(a1);
				
			ArrayList a2 = new ArrayList(); // create new object 
			
			a2.addAll(a1);
				a2.add("Mandloi");
				System.out.println(a2);
			a2.removeAll(a2);			// remove all element
				
				System.out.println(a2);
			a2.addAll(a1);				// add all element
				System.out.println(a2);
			
			a2.clear();
				System.out.println(a2);	// clear all element
		
			a2.addAll(a1);
			System.out.println(a2);
				
			LinkedList d = new LinkedList(); // new object create 
			
			d.addAll(a2);
			
			d.add(100);
			
			System.out.println(d);
			
			System.out.println(d.contains("Sourabh")); // true becouse this element is already exist in a2
			
			System.out.println(d);
			
		
			LinkedList d2 = new LinkedList(); // new object create
				
				d2.addAll(d); // addall d element
				
				d2.containsAll(d); 
				
				boolean b = d2.containsAll(d);  // true
				
				System.out.println(b); 
				
			System.out.println(d2.isEmpty()); // isEmpty Method output false
				
			 	d2.addAll(d);// add d
			 	 System.out.println(d2);
			 	 
			 	 d2.removeAll(d); // remove element
			 	 
			 	 System.out.println(d2);
			 	 
			 	 d2.retainAll(d); // retain element
			 	 
			 	 System.out.println(d);
			 	 
			 	 d.size(); // size of array
			 	 
			 	 System.out.println(d.size());
			 	 
			 	 
				
				
				 
				
		}
		
	}

