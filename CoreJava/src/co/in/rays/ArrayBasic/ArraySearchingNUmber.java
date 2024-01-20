package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArraySearchingNUmber {
	public static void main(String[] args) {
		System.out.print("enter array value");
		Scanner r = new Scanner(System.in);
			int size;
			size = r.nextInt();
			int [] a = new int [size];
			int n = 0;
			int count=0;
			System.out.println("Enter Elements in array");
				for (int i = 0; i < a.length; i++) {
					a[i]=r.nextInt();
				}
					for (int i = 0; i < size; i++) {
						n=r.nextInt();
						a[i]=n;
						count++;
					}
				for (int i = 0; i <size; i++) {
				
					if(count>0) {
				System.out.print("item fount"+count+"times"+" "+n+"\n");
			}
			else {
				System.out.println("item does not found in array");
			}
	}
	
}
}

