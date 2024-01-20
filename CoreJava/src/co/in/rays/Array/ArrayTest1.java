// write a program to find element Index Position in Array.
package co.in.rays.Array;
import java.util.Scanner;
public class ArrayTest1 {
	public static void main(String [] args){
		
		System.out.println("Enter Size of Array");
		Scanner sc = new Scanner(System.in);
			int size;
			size = sc.nextInt();
			int [] arr = new int[size];
			System.out.println("Enter Elements");
		for(int i=0; i<arr.length; i++){
		arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Find Element");
		int found=0;
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]==search){
			found=i;
			}
			
		}
	
		if(found==0){
		System.out.println("Element can not determine");
		}
		else{
		System.out.println("Element fount in index"+found);
		}
	
	}
	
}



