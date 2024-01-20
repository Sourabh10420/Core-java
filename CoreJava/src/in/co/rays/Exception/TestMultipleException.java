package in.co.rays.Exception;

public class TestMultipleException {
	
	public static void main(String[] args) {
		
		
		try {
			
			String name="abc";
			
			System.out.println(name.length());
			
		//	System.out.println(name.charAt(5));
			
			int a=10;
			int b=0;
			
			int c=a/b;
		
			//System.out.println("division="+c);
			
			String names=null;
			
			System.out.println(names.length());
			
			
		} catch (ArithmeticException e) {
			System.out.println("Airthmetic Exception");
		}catch(NullPointerException e) {
			
			System.out.println("nullpointer Exception");
			
			
		}catch(IndexOutOfBoundsException e) {
			
			System.out.println("indexout ofBound ");
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
			
		System.out.println("after try catch");
		
		
	}
	
	
	

}
