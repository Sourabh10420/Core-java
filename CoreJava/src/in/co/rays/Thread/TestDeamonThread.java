package in.co.rays.Thread;

public class TestDeamonThread {
	
	
	public static void main(String[] args) {
		
		
		BackgroundThread t1=new BackgroundThread("Deamon thread");
		
		
	       t1.setDaemon(true);
	       t1.start();
	       
	       
	       
	       for (int i = 1; i <=10; i++) {
	    	   
	    	   try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    	   System.out.println(i+"main");
	    	   
	    	   
			
		}
	       
		
		
		
		
	}
	
	

}
