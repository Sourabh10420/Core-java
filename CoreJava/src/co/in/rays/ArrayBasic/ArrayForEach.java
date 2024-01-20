package co.in.rays.ArrayBasic;
import java.util.Scanner;
	public class ArrayForEach {
		public static void main(String[] args) {
				System.out.println("Enter Size of Array");
			Scanner sc = new Scanner(System.in);
				int size;
				size = sc.nextInt();
			int [] a = new int [size] ;
				System.out.println("Enter Elements in Array");
					for (int i = 0; i < a.length; i++) {
						a[i]=sc.nextInt();
					}
					System.out.println("Print Elements");
					for (int i : a) {
						System.out.print(i+",");
					}
				
		}
}
