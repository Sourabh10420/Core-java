package in.co.rays.basics;
import java.util.Scanner;
	public class Square2_20 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = 0;
				for (int i = 1; i <=20; i++) {
					b = a*a;
					a++;
					System.out.println(b);
					
					
				}
		}
}
