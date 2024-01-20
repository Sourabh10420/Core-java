package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayPrintElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int [] a = new int [size];
		for (int i= 0; i<size; i++) {
			a[i]=sc.nextInt();
		}
			System.out.println("print size of array");	
			for (int i = 0; i < a.length; i++) {
				
				System.out.print(a[i]+",");
				
			}
	}
	
}
