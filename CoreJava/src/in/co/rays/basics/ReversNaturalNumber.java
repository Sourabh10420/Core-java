package in.co.rays.basics;
import java.util.Scanner;
public class ReversNaturalNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int c=0;
		int b = 0;
				System.out.println("Print revers Natural Number");
			for (int i = 1;i<=a; i++) {
					c= a%10;
					b = b*10+c;
					a=a/10;
			}
			System.out.println(b);
	}
}
