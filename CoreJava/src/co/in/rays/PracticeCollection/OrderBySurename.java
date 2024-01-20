package co.in.rays.PracticeCollection;

import java.util.Comparator;

public class OrderBySurename implements Comparator<ExamForm1> {

	@Override
	public int compare(ExamForm1 m1, ExamForm1 m2) {
		
		return m1.getSurename().compareTo(m2.getSurename());
	}

}
