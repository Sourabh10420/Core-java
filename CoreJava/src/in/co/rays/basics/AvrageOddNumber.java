package in.co.rays.basics;

public class AvrageOddNumber {
	public static void main(String[] args) {
		int a = 200;
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
