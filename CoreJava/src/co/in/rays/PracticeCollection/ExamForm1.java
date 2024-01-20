package co.in.rays.PracticeCollection;

import java.util.Comparator;

public class ExamForm1 implements Comparator<ExamForm1> {
	
 private String name;
	 
	 private String Surename;
	 
	 private int rollnum;
	 
	 private String examdate;
	 
	 public ExamForm1(String name,String Surename,int rollnum,String examdate) {
		 
		 this.setName(name);
		 this.setSurename(Surename);
		 this.setRollnum(rollnum);
		 this.setExamdate(examdate);
		 
	 }
	 
	 public String toString() {
		 
		 
		return getName()+" "+getSurename()+" "+getRollnum()+" "+getExamdate();
		 
		 
		 
	}
	 
	 public int compare(ExamForm1 m1,ExamForm1 m2) {
		 
		 if(m2.getName().compareTo(m1.getName())==0) {
			 
			 if(m2.getSurename().compareTo(m1.getSurename())==0) {
				 
				 if(m2.getExamdate().compareTo(m1.getExamdate())==0) {
				 
			 }
		 }
	
	 }
		return m1.getRollnum()-m2.getRollnum();
	
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return Surename;
	}

	public void setSurename(String surename) {
		Surename = surename;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public String getExamdate() {
		return examdate;
	}

	public void setExamdate(String examdate) {
		this.examdate = examdate;
	}
}

