package in.co.rays.Inheritance;

public class TestShape extends Shape {
	
	
	
	public static void main(String[] args) {
		
		Shape p=new Shape();
		
		p.area();
		p.setBorderwidth(50);
		
		p.setColor("black");
		
		System.out.println(p.getBorderwidth());
		
		System.out.println(p.getColor());
		
		
		Ractangle r=new Ractangle();
		
		r.setLength(50);
		r.setWidth(50);
		
		r.area();
		
		System.out.println(r.getLength());
		
		System.out.println(r.getWidth());
		
	}
	
	

}
