package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		System.out.println("Enter array size");
		Scanner sc=new Scanner(System.in);
			int size,sum = 0;
			size = sc.nextInt();
			int [] a = new int [size];
				System.out.println("Enter array Element");
					for (int i = 0; i < a.length; i++) {
						a[i]=sc.nextInt();
					}
				System.out.println("Array Elements Sum");
					for (int i = 0; i < a.length; i++) {
						sum = sum+a[i];
					}
					
						System.out.println(sum);

			}

}
