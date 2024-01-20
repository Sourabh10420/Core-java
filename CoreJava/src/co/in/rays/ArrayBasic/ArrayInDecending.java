package co.in.rays.ArrayBasic;
import java.util.Scanner;
	public class ArrayInDecending {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int [] a = new int [5];
			int temp;
			System.out.println("enter Array elements");
				for (int i = 0; i <5; i++) {
					a[i]=sc.nextInt();
				}
				
					for (int i = 0; i <5; i++) {
						for (int j = i+1; j <5; j++) {
							if(a[i]<a[j]) {
									temp = a[i];
									a[i]=a[j];
									a[j]=temp;
							}
						
						}
					}
					System.out.println("print Array in descending order");
					for (int i = 0; i <5; i++) {
						System.out.print(a[i]+" ");
						
					}
			
		}
}
