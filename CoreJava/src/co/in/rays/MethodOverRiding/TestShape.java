package co.in.rays.MethodOverRiding;

public class TestShape {

	public static void main(String[] args) {
		
		Shape p = new Shape();
		 
		p.area();
		
		Circle c = new Circle();
			c.area(145);
		
		Ractangle r = new Ractangle();
			r.area(20, 10);
			
		
	}
}
