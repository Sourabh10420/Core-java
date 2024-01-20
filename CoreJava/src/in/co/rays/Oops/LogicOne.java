package in.co.rays.Oops;

public class LogicOne {
	
	
	public void sum(int a,int b) {
		
		
		int c=a+b;
		
		
		System.out.println("sum="+c);
		
	}
	
public void noteCount(int number) {
	
	
	
	int count=0;
	
	int[] notes= {500,200,100,50,20,10,5,2,1};
	
	for (int i = 0; i < notes.length; i++) {
		
		count=number/notes[i];
		
		number=number%notes[i];
		
		if (count>0) {
			
			System.out.println(notes[i]+ "="+count);
		}
	}
			
		}
		public void oddNumber(int num) {
				int count = 0;
				int sum= 0;
				int avg = 0;
					for (int i = 1; i <=100; i++) {
						if(i%2!=0) {
							sum=sum+i;
							count++;
							
						}
						
					}
				avg = sum/count;
						System.out.println(avg);
		}
}



