package in.co.rays.java8;

public interface DefaultStaticMethod {

	public void abstractMethod();
	
	
	
	public default void defaultMethod() {
		System.out.println("this is default method");
	}
	

	
	
	public static void staticMethod() {
		
		System.out.println("this is static method");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
