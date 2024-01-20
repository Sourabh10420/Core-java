package in.co.rays.Thread;

public class TestWithThread {
	
	
	public static void main(String[] args) {
		
		WithThread t1=new WithThread("sourabh");
		
		WithThread t2=new WithThread("deepak");
		
		
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
