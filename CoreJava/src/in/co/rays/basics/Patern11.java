package in.co.rays.basics;
import java.util.Scanner;
	public class Patern11 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				int b = sc.nextInt();
					for (int i = 1; i <=a; i++) {
						for (int j = 1; j <=b; j++) {
							if(i>=j){
								System.out.print("*");
							}
							else {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
		}
}
