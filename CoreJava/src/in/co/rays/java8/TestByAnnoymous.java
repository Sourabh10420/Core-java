package in.co.rays.java8;

public class TestByAnnoymous {
	
	
	public static void main(String[] args) {
		
		Hello h= new Hello() {
			
			
			@Override
			public void say() {
				System.out.println("Functional interface by Annoymous fuction");
				
			}
		};
		
		h.say();
		
		
	}

}
