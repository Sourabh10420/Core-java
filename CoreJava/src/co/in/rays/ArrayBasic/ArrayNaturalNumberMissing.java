package co.in.rays.ArrayBasic;
import java . util.Scanner;
public class ArrayNaturalNumberMissing {
	public static void main(String[] args) {
		System.out.println("enter size of array1");
		Scanner sc = new Scanner(System.in);
		int size,sum=0,sum1 = 0,number,size1;
	
		size = sc.nextInt();
		System.out.println("enter size of array2");
		size1=sc.nextInt();
			int [] a = new int [size];
			int [] a1 = new int [size1];
		
			 	
			 			System.out.println("Enter Elements in Array 1");
					for (int i = 0; i <size; i++) {
						a[i]=sc.nextInt();
					}
					System.out.println("Enter Elements in Array2");
						for (int j = 0; j <size1 ; j++) {
							a1[j]=sc.nextInt();
						}
					
					System.out.println("Print Missing Natural Number in Array");
					for (int i = 0; i < size; i++) {
						sum = sum-a[i];
					}
						for (int j = 0; j <size1; j++) {
							sum1 = sum1-a[j];
					}
					
			number = sum1-sum;	
					
				System.out.println(number);
		}
}