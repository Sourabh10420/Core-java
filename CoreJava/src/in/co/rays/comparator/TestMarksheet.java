package in.co.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
	
		List list=new ArrayList();
		
		
		list.add(new Marksheet(4, "pooja", 80));
		list.add(new Marksheet(3, "pooja", 70));
		
		list.add(new Marksheet(5, "deepak", 90));
		list.add(new Marksheet(2, "smita", 20));
		list.add(new Marksheet(1, "luxman", 100));
		
		
		Collections.sort(list, new OrderByNameAsc());
		
		System.out.println(list);
		
		List list1=new ArrayList(list);
		
		Collections.sort(list1, new OrderByNameDesc());
		
		System.out.println(list1);
		
		
		List list2=new ArrayList(list);
		Collections.sort(list2, new OrderByIdAsc());
		
		System.out.println(list2);
	}

}
