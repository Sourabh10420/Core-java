package in.co.rays.Exception;

public class TestOutOfBound {
	
	
	public static void main(String[] args) {
		
	
		
	
		String[] names= {"abc"};
		
		String name="abc";
		
		
		try {
		System.out.println(names[0]);
		
		
		
		System.out.println(name.charAt(5));
		
		
	} catch (Exception e) {
		
	
		System.out.println(e.getMessage());
		
	
	}	
	System.out.println("After");
	
	}

}
