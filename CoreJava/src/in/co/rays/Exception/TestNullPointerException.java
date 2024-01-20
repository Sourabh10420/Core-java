package in.co.rays.Exception;

public class TestNullPointerException {
	
	
	public static void main(String[] args) {
		
		
		
		try {
			
		
		String name=null;
		
		System.out.println(name.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	
	
	

}
