package co.in.rays.ArrayShit1;
//Q16.Write a program to find reverse of an array
import java.util.Scanner;
public class ReversingArrayElement {
	public static void main(String[] args){
		System.out.println("Enter Array Size");
		Scanner sc = new Scanner(System.in);
		int size;
		size =sc.nextInt();
		int [] arr = new int [size];
		
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			System.out.println("Before reversing Array");
			for(int p : arr){
			System.out.print(p+"\t");
			}
			System.out.println("\nAfter reversing Array ");
			for(int j=arr.length-1; j>=0; j--){
			System.out.print(arr[j]+"\t");
			}
		}	

}
