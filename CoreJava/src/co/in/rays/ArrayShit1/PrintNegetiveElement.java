//Q2. Write a program to print all negative elements in an array.
package co.in.rays.ArrayShit1;
import java.util.Scanner;
public class PrintNegetiveElement {
	public static void main(String [] args){
			System.out.println("enter Array Size");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int []arr = new int [size];
			System.out.println("Print Elemnt Randomly");
			for(int i=0; i<arr.length; i++){
				arr[i] = sc.nextInt();
				
			} 
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("\n"+"print Negetive element");
			for(int p: arr){
				if(p<0){
				System.out.print(p+",");
				}
			}
		}
	}

