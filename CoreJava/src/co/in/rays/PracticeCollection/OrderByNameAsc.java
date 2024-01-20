package co.in.rays.PracticeCollection;

import java.util.Comparator;

public class OrderByNameAsc implements Comparator<ExamForm1> {

	
	public int compare(ExamForm1 m1, ExamForm1 m2) {
		
		return m1.getName().compareTo(m2.getName()) ;
		
		
		
		
	}

}
