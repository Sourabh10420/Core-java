package in.co.rays.Thread;

public class TestSleep {
	
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=10; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(i);
			
		}
		
		
		
		
		
	}

}
