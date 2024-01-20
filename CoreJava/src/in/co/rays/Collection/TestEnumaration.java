package in.co.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumaration {

	
	public static void main(String[] args) {
		
		Vector v =new Vector();
		
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		System.out.println(v);
		
		
		Enumeration e=v.elements();
		
		v.add(50);
		v.add(50);
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
			
		}
		
		
	}
}
