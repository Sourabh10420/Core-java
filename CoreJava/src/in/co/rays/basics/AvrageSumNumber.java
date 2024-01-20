package in.co.rays.basics;

public class AvrageSumNumber {
	public static void main(String[] args) {
		int a=40;
		int count=0;
		int sum=0;
		int avg=0;
			for (int i = 0; i <=a; i++) {
				
				if(i%2==0) {
				
				sum=sum+i;
				count++;
				}
				
			}
		avg = sum/count;
			System.out.println(avg);
	}			
}	