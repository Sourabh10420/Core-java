package ExceptionPractice;

public class TestLoginException {
	public static void main(String[] args) {
		 String a = "Sourabh";
		 
		 if(a.equals("Mandloi")) {
			 System.out.println("user valid name");
			 
		 }
		 else {
			 try {
			
			 throw new LoginException();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 }
	}
}


