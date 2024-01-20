package in.co.rays.basics;
import java.util.Scanner;
public class PrimeNumber11 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
		if(a<2) {
			System.out.println("this is not a prime number");
		}
		else {
			System.out.println("this is prime number");
		}
		for (int i = 3; i <=a; i++) {
			if((i%2==0)&&(i%3==0)) { 
				System.out.println("this is not a prime number");
			}
			else {
				System.out.println("this is prime number");
			}
	}
	
	
}
}
