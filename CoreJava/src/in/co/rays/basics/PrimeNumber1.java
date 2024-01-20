package in.co.rays.basics;
import java.util.Scanner;
public class PrimeNumber1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
		for (int i = 1; i <a/2 ; i++) {
				if(a<=1) {
					System.out.println("this is not a prime number");
				}
			for (int j = 1; j <=a/2; j++) { 
				if(a%j==0)
					count++;
			if(count>1) {
				System.out.println("this is not a prime number");
			}
			else {
				System.out.println("this is a prime number");
			}
		}
				
	}
}				
}