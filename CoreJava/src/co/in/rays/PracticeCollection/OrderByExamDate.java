package co.in.rays.PracticeCollection;

import java.util.Comparator;

public class OrderByExamDate implements Comparator<ExamForm1>{

	
	public int compare(ExamForm1 m1, ExamForm1 m2) {
	
		return m1.getExamdate().compareTo(m2.getExamdate());
	}

}
