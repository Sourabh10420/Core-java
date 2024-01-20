package co.in.rays.OppsPractice;

public class NoteCount1 {
	
		public void NoteCount1(int number) {
			
				int count = 0;
				
		int [] a = {500,200,100,50,20,10,5,2};
		
			for (int i = 0; i < a.length; i++) {
					count = number/a[i];
					number=number%a[i];
				
					if(count>0) {
						System.out.println(a[i]+" "+count);
					}
				
			}
		}
}