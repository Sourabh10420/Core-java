package in.co.rays.Thread;

public class TestRacing {

	
	public static void main(String[] args) {
		
		
		Racing r1=new Racing("sourabh");
		
		Racing r2=new Racing("mandloi");
		
		
		
		
		r1.start();
		r2.start();
		
		
		
	}
	
	
	
	
}
