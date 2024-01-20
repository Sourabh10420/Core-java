package ExceptionPractice;

public class TestException2 {
	public static void main(String[] args) {
		String loginId="24534";
		String username = "Sourabh";
		String lastname= "Mandloi";
		String address = "Indore";
		String loginpassword= "Sourabh1432";
		
	if(loginId.equals("24534")) {
			System.out.println("user loginId is valid");
	}
	else {
		try {
			throw new Exception2(loginId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	if(username.equals("Sourabh")) {
		System.out.println("user name is valid");
	}
	else {
		try {
			throw new Exception2(username,loginId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	if(lastname.equals("Mandloi")) {
		
		System.out.println("User lastname is valid");
	}
	else {
		try {
			throw new Exception2(lastname,username,loginId)
;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	if(address.equals("Indore")) {
		System.out.println("user Address is valid");
		
	}
	else {
		try {
			throw new Exception2(address,loginId,username,lastname);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	if(loginpassword.equals("Sourabh1432")) {
		System.out.println("user loginpassword is valid");
	}
	else {
		try {
			throw new Exception2(loginpassword,address,username,lastname,loginId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}
	
}
