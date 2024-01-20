package in.co.rays.Thread;

public class WithOutThread {
	
	
	public String name=null;
	
	
	public WithOutThread(String name) {
		
		this.name=name;
		
	}
	
	
	public void run() {
		
		
		for (int i = 0; i <=5; i++) {
			
			System.out.println(i+" "+name);
			
		}
		
		
	}
	

}
