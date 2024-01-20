package in.co.rays.basics;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int copy=number;
		int sum=0;
		int digit=0;
		int totalNo=0;
		int target=number;
			for (int i = 1;copy>0; i++) {
				copy= copy/10;
				totalNo++;
			}
			for(int j=1;number>0;j++) {
				digit = number%10;
				int power = 1;
					for (int k = 1; k <= totalNo; k++) {
						power= power*digit;
						
					}
					sum=sum+power;
					number= number/10;
			}
			if(target==sum) {
				System.out.println("this number is armstrong number");
			}
			else {
				System.out.println("this number is not a armstrong number");
			}
		
	}
}
