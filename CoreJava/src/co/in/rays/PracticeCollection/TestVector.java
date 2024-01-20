package co.in.rays.PracticeCollection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.addElement("sourabh");
		v.addElement("mandloi");
		v.add(10);
		v.addElement(3);
		v.add(true);
		v.add(null);
		
		System.out.println(v);
		
		int c = v.capacity();
		
		System.out.println(c);
		
		Object o = v.firstElement();
		
		System.out.println(o);
		
		Object O = v.lastElement();
		
		System.out.println(O);
		
		boolean b = v.removeElement(3);
		
		System.out.println(b);
		System.out.println(v);
		
		Object m = v.elementAt(1);
		
		System.out.println(m);
		
		v.insertElementAt(true,1);
		
		System.out.println(v);
		
		v.setElementAt("Muskan", 5);
		
		System.out.println(v);
		
		v.contains(1);
		
		System.out.println(v);
		
		Enumeration e =v.elements();
		
		System.out.println(e.getClass().getName());
		
	Enumeration e1=v.elements();
		
		v.add(50);
		v.add(50);
		
		while(e1.hasMoreElements()) {
			
			System.out.println(e1.nextElement());
			
	}
}
}