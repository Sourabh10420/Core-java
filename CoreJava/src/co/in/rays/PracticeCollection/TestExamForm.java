package co.in.rays.PracticeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestExamForm {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		 
		list.add(new ExamForm("sourabh","mandloi1",105,"10-12-2023"));
		list.add(new ExamForm("muskan","mandloi5",102,"11-12-2023"));
		list.add(new ExamForm("laxmi","mandloi3",101,"12-12-2023"));
		list.add(new ExamForm("shankar","mandloi2",104,"13-12-2023"));
		list.add(new ExamForm("manoj","mandloi4",103,"14-12-2023"));
		list.add(new ExamForm("shivani","mandloi6",106,"15-12-2023"));
		
		Collections.sort(list);
		
		Iterator it	=list.iterator();
		
		
		while(it.hasNext()) {
			
			
			System.out.println(it.next());
		}
			
		
		
	}
}
