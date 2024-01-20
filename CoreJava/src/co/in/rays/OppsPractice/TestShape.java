package co.in.rays.OppsPractice;

public class TestShape extends Shape{
	public static void main(String[] args) {
		
			 Shape p = new Shape();
			 
			 p.setBoarderHight(50);
			 p.setBoarderWhidth(20);
			 p.setColor("green");
			 	System.out.println(p.getBoarderWhidth());
			 	System.out.println(p.getColor());
			 	
			 	Rectangle r = new Rectangle();
			 		r.setLenght(20);
			 		r.setWidth(14);
			 		
			 	r.area();
			 		
	}


}
