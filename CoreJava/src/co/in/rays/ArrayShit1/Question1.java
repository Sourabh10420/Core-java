//Q.1Write a program to read and print elements of array. - using recursion.
package co.in.rays.ArrayShit1;
import java.util.Scanner;
public class Question1 {
	
	public static int arrayElement( int k){
		
			Scanner sc = new Scanner(System.in);
			int size;
			size = sc.nextInt();
			int [] arr = new int [size];
		
				for(int i=0; i<arr.length;i++){
					 arr[i]=sc.nextInt();
					 if(k<arr.length) {
					System.out.print(arr[k]+",");
					arrayElement(k+1);
					}
			
				}
				return k;
	}
	public static void main(String[]args) {
		arrayElement(0); 
	}
	
}

	

