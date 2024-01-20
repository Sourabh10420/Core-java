package in.co.rays.Thread;

public class TestWithOutThread {
	
	
	public static void main(String[] args) {
		
		
		WithOutThread t1= new WithOutThread("sourabh");
		
		WithOutThread t2=new WithOutThread("deepak");
		
		
		t1.run();
		t2.run();
		
		
		
	}

}
