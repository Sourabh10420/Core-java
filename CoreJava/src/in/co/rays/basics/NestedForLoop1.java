package in.co.rays.basics;
import java.util.Scanner;
	public class NestedForLoop1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				int row = sc.nextInt();
				int colm= sc.nextInt();
				
				int space=5;
			for(int i =1;i<=row;i++) {
					for (int j = 1;j<=colm; j++) {
						if(i<space) {
							System.out.print(" ");
						}
						else {
							System.out.print("*");
							
						}
					}
					System.out.println();
			}
		}
}
