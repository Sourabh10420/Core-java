package in.co.rays.Collection;

public class Marksheet implements Comparable<Marksheet> {

	
	private int id;
	private String name;
	private int marks;
	
	
	
public Marksheet(int id,String name,int marks) {
	
	this.id=id;
	this.name=name;
	this.marks=marks;
	
}
	
public String toString() {
	return id+" "+name+" "+marks;
	
	
}
	

	
	public int compareTo(Marksheet m1) {
		
	//return this.id-m1.id;
		
		//return this.marks-m1.marks;
		
		return this.name.compareTo(m1.name);
	}
	
	
	

}
