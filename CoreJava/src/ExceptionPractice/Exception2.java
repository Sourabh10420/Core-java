package ExceptionPractice;

public class Exception2 extends Exception {
		private String loginId="24534";
		private String username = "Sourabh";
		private String lastname= "Mandloi";
		private String address = "Indore";
		private String loginpassword= "Sourabh1432";
		
		public Exception2(String loginId) {
			super("login id is invalid");
			
		}
		public Exception2(String usernmae,String loginId) {
			super("user name is invalid");
		}
		public Exception2(String lastname,String username,String loginId) {
			super("user lastname is invalid");
		}
		public Exception2(String address,String username,String lastname,String loginId) {
			super("user address is invalid");
		}
		public Exception2(String loginpassword,String username,String lastname,String address,String loginId) {
			super("user loginpassword is invalid");
		}
}
