package in.co.rays.java8;

public class TestDefaultStatic {
	
	public static void main(String[] args) {
		
		
		DefaultStaticMethod ds=new DefaultStaticMethod() {
			
			@Override
			public void abstractMethod() {
				System.out.println("this is abstract method");
				
			}
		};
		
		ds.abstractMethod();
		ds.defaultMethod();
		
		DefaultStaticMethod.staticMethod();
	}

}
