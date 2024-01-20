package co.in.rays.PracticeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestExamForm1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new ExamForm1("sourabh", "mandloi1", 101, "22-12-2024"));
		list.add(new ExamForm1("muskan", "mandloi4", 107, "21-12-2024"));
		list.add(new ExamForm1("manoj", "mandloi6", 106, "24-12-2024"));
		list.add(new ExamForm1("ranjna", "mandloi2", 104, "23-12-2024"));
		list.add(new ExamForm1("kunal", "mandloi3", 103, "25-12-2024"));
		list.add(new ExamForm1("laxmi", "mandloi5", 105, "27-12-2024"));
		list.add(new ExamForm1("shivani", "mandloi7", 102, "26-12-2024"));
		
		Collections.sort(list, new OrderByNameAsc());
		
		
		Iterator it	=list.iterator();
		
		System.out.println("Accending order name");
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println("Accending order surename");
			
		List list1 =new ArrayList(list);
		
		Collections.sort(list1, new OrderBySurename());
		
		Iterator it1 =list1.iterator();
		
		while (it1.hasNext()) {
			
			System.out.println(it1.next());
			
		}
		System.out.println();
		System.out.println("aceending order rollnumber");
		List list2 = new ArrayList(list);
		
		Collections.sort(list2,new OrderByRollNumAsc());
		
		Iterator it2 = list2.iterator();
		
		for (int i = 0; i <7; i++) {
			if (it2.hasNext()) {
				
				System.out.println(it2.next());
				
			}
			
		}
		System.out.println();
		System.out.println("order Accending by examdate");
		List list3 = new ArrayList(list);
		
		Collections.sort(list3, new OrderByExamDate());
		
		Iterator it3 = list3.iterator();
		
		for (int i = 0; i < 7; i++) {
			if (it3.hasNext()) {
				
				System.out.println(it3.next());
				
			}
			
		}
		
	
			
		
	}
}
