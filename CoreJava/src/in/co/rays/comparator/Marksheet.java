package in.co.rays.comparator;

import java.util.Comparator;

public class Marksheet implements Comparator<Marksheet> {
	
	public int id;
	public String name;
	public int marks;
	
	
	
	
	public Marksheet(int id,String name,int marks) {
		
		this.id=id;
		this.name=name;
		this.marks=marks;
	
	}
	
	
	public String toString() {
		return id+" "+name+" "+marks;
	
	}
	
	
	
	

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		
		if (m2.name.compareTo(m1.name)==0){
			
			if (m1.marks-m2.marks==0) {
				
			}
			
			
			
		}
		
		return m1.id-m2.id;
	}


}
