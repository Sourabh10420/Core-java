package co.in.rays.OppsPractice;

public class TestAreaOf extends CircleInheritence{
	public static void main(String[] args) {
			
		CircleInheritence c = new CircleInheritence();
			c.setRedius(14);
		
			CylenderInheritence c1 = new CylenderInheritence();
			  c1.setRedius(15);
			  c1.setHight1(12);
			  
			  c.areaOf();
			  c1.areaOff();
			  
			  
		 
	}
}
