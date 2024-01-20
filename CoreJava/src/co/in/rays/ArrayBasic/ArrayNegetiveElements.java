package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayNegetiveElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			 int size;
			 System.out.print("Enter Size Of Array");
			size = sc.nextInt();
			int [] a = new int[size];
						System.out.print("Enter Elements In Array");
					for (int i = 0; i <size; i++) {
						a[i]=sc.nextInt();
					}
					System.out.println("Print Negetive Elements In Array");
					for (int i = 0; i <size; i++) {
						if (a[i]<0) {
							
					System.out.print(a[i]+",");
				}
		}
}
}

