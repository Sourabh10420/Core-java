package co.in.rays.OppsPractice;

public class PrimeNumber1{
	public void PrimeNumber1(int num) {
		int count = 0;
		for (int i = 2; i <=100; i++) {
			if(num==2) {
				System.out.println("this number is prime number");
			}
			else {
				if(num%i==0) {
					System.out.println("this number is prime number");
				
				}
				else {
					System.out.println("this number is not a prime number");
				}
			System.out.println();
		}
	}		
}			
}				