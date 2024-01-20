package in.co.rays.inheritance1;

public class TestShape {
	
	
	public static void main(String[] args) {
		
		Shape s=new Shape();
		
		
		s.setColor("green");
		
		s.setBorderwidth(40);
		
		
		System.out.println(s.getColor());
		
		System.out.println(s.getBorderwidth());
		
		Ractangle r= new Ractangle();
		System.out.println("Ractangle");
		r.setLength(20);
		r.setWidth(10);
		
		System.out.println(r.getLength());
		
		System.out.println(r.getWidth());
		
		r.area();
		
		
		Circle c= new Circle();
		System.out.println("circle");
		c.setRadius(7);
		
		System.out.println(c.getRadius());
		c.area();
		
		
		
		Triangle t=new Triangle();
		
		System.out.println("triangle");
		t.setBase(15);
		
		t.setHieght(13);
		
		
		
		System.out.println(t.getBase());
		
		System.out.println(t.getHieght());
		t.area();
			
	
	}

}
