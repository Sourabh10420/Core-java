package in.co.rays.basics;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int b = 0;
	int c=0;
	int d = num;
	
		for (int i = 0; i < args.length; i++) {
				if(d!=0) {
				c=d%10;
				b=b*10+c;
				d=num/10;
				System.out.println(b);
				}
	
		}
}
}
	
