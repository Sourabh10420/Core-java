package in.co.rays.abs;

public class Circle extends Shape {
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public void area() {
		
		double rArea= 3.14 * getRadius() * getRadius();
		
		System.out.println(rArea);
		
		
	}
	
	
	
	
	
	

}
