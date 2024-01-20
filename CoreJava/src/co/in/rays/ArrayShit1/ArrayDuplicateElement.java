package co.in.rays.ArrayShit1;
//Q13.Write a program to count total number of duplicate elements in an array.
import java.util.Scanner;
public class ArrayDuplicateElement {
	public static void main(String[] args){
		System.out.println("Enter Size Of Array");
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int [] arr = new int [size];
		int count=0;
		int element=0;
			for(int i=0; i<size; i++){
				arr[i]=(int)(10*Math.random());
			}
			System.out.println("Array is : ");
			for(int p : arr){
			System.out.print(p+"\t");
			}
			for(int i=0; i<size; i++){
				for(int j=0; j<size; j++){
					if(arr[i]==arr[j]){
					element=arr[i];
					count++;
					
					}
					
				}
				
			}
			System.out.println("\n"+"The total Number of Duplicate element is "+count);
		}
	}

