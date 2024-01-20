package in.co.rays.basics;
import java.util.Scanner;
	public class CountNumberDigit {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = 0;
			int count=0;
			 for (int i = 1; a>0; i++) {
				 	a = a/10;
				 	count++;
				 	
			}
			 System.out.println(count);
		}
}
