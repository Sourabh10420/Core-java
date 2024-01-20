package ExceptionPractice;

public class TestException1 {
	public static void main(String[] args) {
		
		String name = "Sourabh";
		String lastname= "mandloi";
		String email = "sourabhmandloi04@gmail.com";
		
		
		if(name.equals("Sourabh")) {
			System.out.println("user is valid name");
		}
		else {
			try {
				throw new Exception1(name);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		if(lastname.equals("mandloi")) {
			System.out.println("user last name is valid");
		}
		else {
			try {
				throw new Exception1(lastname,name);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		if(email.equals("sourabhmandloi04@gmail.com")) {
			System.out.println("email is valid");
		}
		else {
			try {
				throw new Exception1(email,name,lastname);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
