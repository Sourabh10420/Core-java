package co.in.rays.ArrayShit1;
//Q19.Write a program to sort array elements in ascending or descending order
import java.util.Scanner;
public class ArrayAccendingDecending {
	
		public static void main(String[] args){
					System.out.println("Enter Array Size");
			Scanner sc = new Scanner(System.in);
			int size;
			size = sc.nextInt();
			int [] arr = new int [size];
			System.out.println();
			for(int i=0; i<arr.length;i++){
				arr[i]=(int)(10*Math.random());
			}
			System.out.println("Array is : -");
			for(int p : arr){
			System.out.print(p+"\t");
			}
			System.out.println("\n"+"After descending order");
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr.length; j++){
					if(arr[i]>arr[j]){
						int temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}

				}
			}
		
			for(int p : arr){
			System.out.print(p+"\t");
			}
			System.out.println("\n"+"After ascending order");
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr.length; j++){
					if(arr[i]<arr[j]){
						int temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}

				}
			}
			System.out.println();
			for(int p : arr){
			System.out.print(p+"\t");
			}
		}
	
}
