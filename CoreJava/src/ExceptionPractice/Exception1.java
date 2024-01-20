package ExceptionPractice;

public class Exception1 extends Exception {
		private String name = "sourabh";
		private String lastname = "mandloi";
		private String email = "sourabhmandloi04@gmail.com";
	
		public Exception1(String name) {
			
			super("user name invalid");
			
		}
		public Exception1(String lastname,String name) {
			super("user lastname invalid");
		}
		public Exception1(String name,String lastname,String email) {
			super("user email invalid");
		}
}
