package in.co.rays.Thread;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		Thread t1=new Thread(new ByRunnable("sourabh"));
		
		
		
		
	   
		
		
		Thread t2=new Thread(new ByRunnable("mandloi"));
		
		
       //  t1.setPriority(7);
		
		int i=t1.getPriority();
		
		
int i2=	t1.MAX_PRIORITY;
		t1.start();
		t2.start();
		
		
		
		
		
		
	}
	
	
	
	

}
