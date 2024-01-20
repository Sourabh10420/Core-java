package in.co.rays.abs;

public class Ractangle extends Shape{

	private int length;
	private int width;
	
	
	public int getLength() {
		return length;
	}
	
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	public void area() {
		
		int rArea=getLength() * getWidth();
		
		System.out.println("Ractangle="+rArea);
		
	}
	

}
