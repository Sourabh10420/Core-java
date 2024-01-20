package in.co.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) {
		
		
		List list =new ArrayList();
		
		
	list.add(new Marksheet(5, "sourabh", 90));
		
	list.add(new Marksheet(4, "muskan", 50));
		
	list.add(new Marksheet(3, "mandloi", 80));
	list.add(new Marksheet(2, "gurjar", 40));
	
	list.add(new Marksheet(1, "pooja", 100));
	
	
	Collections.sort(list);
	
	
	System.out.println(list);
		
		
	}

}
