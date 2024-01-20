package in.co.rays.Exception;

public class TestLoginException1 {
	public static void main(String[] args) throws LoginException1 {
		
		String name = "Sourabh";
			if(name.equals("Sourabh")) {
				System.out.println("this is true");
			}
			else {
				throw new LoginException1();
				
			}
	}
}
