package in.co.rays.inheritance1;

public class Triangle extends Shape{
	
	
	private int base=0;
	
	private int hieght=0;
	
	
	
	public void setBase(int base) {
		
		this.base=base;
		
		
	}
	
	
	public int getBase() {
		return base;
		
	}
	
	public void setHieght(int hieght) {
		
		this.hieght=hieght;
	
		
	}
	
	
	public int getHieght() {
		return base;
		

	}

	public void area() {
		
		double rArea=(getBase() * getHieght())/2;
		
		System.out.println("Triangle="+rArea);
	}
	
}
