package in.co.rays.inheritance1;

public class Circle extends Shape {
	
	
	private int radius=0;
	
	
	public void setRadius(int radius) {
		
		this.radius=radius;
		
	}
	
	public int getRadius() {
		return radius;
		
		
	}
	
	public void area() {
		
		double rArea=3.14 * getRadius() * getRadius();
		
		System.out.println("Circle Area="+rArea);
		
		
	}
	
	

}
