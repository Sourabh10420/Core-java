package co.in.rays.PracticeCollection;

import java.util.Comparator;

public class OrderByRollNumAsc implements Comparator<ExamForm1> {

	
	public int compare(ExamForm1 m1,ExamForm1 m2) {
	
		return m1.getRollnum()-m2.getRollnum();
	}

}
