package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayElementsNegetiveDecending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, temp;
			System.out.println("enter Size In Array");
		size = sc.nextInt();
		int [] a = new int[size];
				System.out.print("Enter Elements in Array");
						for (int i = 0; i < size; i++) {
							a[i] = sc.nextInt();
						}
							System.out.println("Print negetive Elements");
							for (int i = 0; i < a.length; i++) {
								if(a[i]<0) {
									System.out.print(a[i]+",");
								}
							}
								for (int i = 0; i <a.length; i++) {
									for (int j = i+1; j <a.length; j++) {
										if(a[j]>a[i]) {
												temp = a[i];
												a[i]=a[j];
												a[j]=temp;
										}
									}
								
								}	
						System.out.println("\n"+"Print Array in Decending Order");
							for (int i = 0; i < a.length; i++) {
							
								System.out.print(a[i]+",");
								
						}
							
	}
}


