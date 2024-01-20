package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayAccendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int [] a = new int[5];
	int temp;
		System.out.println("enter array element");
		for (int i = 0; i <= a[i]; i++) {
			for (int j = 0; j <= a[i]-1-i; j++) {
				if(a[j]>a[j+1]) {
				temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}																							
		System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
