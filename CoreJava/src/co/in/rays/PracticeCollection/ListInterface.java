package co.in.rays.PracticeCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {
	
	public static void main(String[] args) {
		
		//	public void add(int index,object o);
		
	//	add an element on the specifide index with shifting opration
		
		 ArrayList  a = new ArrayList();
		
		a.add("sourabh");	//|
		a.add('S');			//|
		a.add(true);		//| this element is collection method
		a.add(55.55);		//|
		a.add("mandloi");	//|
							//|
		System.out.println(a);
		
		ArrayList a2 = new ArrayList();
		
		a2.add(0, "Sourabh");	// 
		a2.add(1,"muskan");		//
		a2.add(2, false);		//
		a2.add(3, 100);			// this method is ListInterface
		a2.add(4, "gurjar");	//
		a2.add(5, null);		//
	
		System.out.println(a2);
		
		a2.remove(1); // remove index position element
		System.out.println(a2);
		
		Object o = a2.get(3); // get specific index element
		
		System.out.println(o);
		
		
		a2.set(4, "gurjar"); // set element specific position
		
		System.out.println(a2);
		
		int i = a2.indexOf("gurjar"); // index of first occure element
		
		System.out.println(i);
		
		int j = a2.lastIndexOf("gurjar"); // last index of element occure
		
		System.out.println(j);
		
		List L = a2.subList(1, 4); // sub list peramiteraised first to last and import List utill class
		
		System.out.println(L);
		
		ArrayList a3 = new ArrayList();
		
		a3.addAll(a2);
		
		System.out.println(a3);
		
		ListIterator l = a3.listIterator();
		
		System.out.println(l); // java.util.ArrayList$ListItr@200a570f output becouse this is memory address
		
		a3.clear();// clear method collection
		
		System.out.println(a3);
	}
}
