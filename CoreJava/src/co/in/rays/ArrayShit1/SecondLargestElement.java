//Q5. Write a program to find second largest element in an array.
package co.in.rays.ArrayShit1;
import java.util.Scanner;
public class SecondLargestElement {
	public static void main(String[] args){
		System.out.println("Enter array size");
		Scanner sc =new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int [] arr = new int [size];
		int largest=0;
		int secondLargest=0;
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			for(int p : arr){
				System.out.print(p+"\t");
				if(largest<p){
					largest=p;
				}
			
			for(int j=0; j<arr.length; j++){
				if(arr[j]<largest){
					if(secondLargest<arr[j]){
						secondLargest=arr[j];
					}
				}
			}
			System.out.println("\nThe Second largest element in Array is : "+secondLargest);
	}
	}
}

