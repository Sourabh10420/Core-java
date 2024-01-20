package co.in.rays.PracticeCollection;

public class ExamForm implements Comparable<ExamForm>{

	 private String name;
	 
	 private String Surename;
	 
	 private int rollnum;
	 
	 private String examdate;
	 
	 public ExamForm(String name,String Surename,int rollnum,String examdate) {
		 
		 this.name =name;
		 this.Surename= Surename;
		 this.rollnum = rollnum;
		 this.examdate =examdate;
		 
	 }
	 
	 public String toString() {
		 
		 
		return name+" "+Surename+" "+rollnum+" "+examdate;
		 
		 
		 
	}
	 
	 public int compareTo(ExamForm m1) {
		 
		//return this.rollnum-m1.rollnum;
		
		// return this.examdate.compareTo(m1.examdate);
		// return this.name.compareTo(m1.name);
		 return this.Surename.compareTo(m1.Surename);
		 
		 
	 }
	
	

}
