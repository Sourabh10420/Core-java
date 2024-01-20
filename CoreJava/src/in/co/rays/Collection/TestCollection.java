package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		
		Collection c1= new ArrayList();
		
		c1.add("sourabh");
		c1.add(12);
		c1.add('S');
		
		c1.add(2.0);
		
		
		System.out.println(c1);
		
		Collection c2= new ArrayList();
		
		c2.add("deepak");
		c2.add(10);
		c2.add('d');
		c2.add(12);
		
		c2.add(null);
		
		System.out.println(c2);
		
		c1.addAll(c2);
		
		System.out.println(c1);
		
		//c1.clear();
		//System.out.println(c1);
		c1.isEmpty();
		System.out.println(c1.isEmpty());
			
		
	}
	

}
