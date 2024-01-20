package in.co.rays.Exception;

public class TestLoginException {
	
	public static void main(String[] args) {
		
		
		String name="Admi";
		
		
		if (name.equals("Admin")) {
			
			System.out.println("user valid");
		}else {
			
			try {
				
				throw new LoginException();
				
				
			} catch (Exception e) {
				
				System.out.println(e);
				
				
				
				
			}
			
			
			
		}
		
		
		
	}

}
