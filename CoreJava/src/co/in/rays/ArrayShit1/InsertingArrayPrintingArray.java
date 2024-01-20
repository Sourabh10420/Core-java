package co.in.rays.ArrayShit1;
//Q9. Write a program to insert an element in an array.
import java.util.Scanner;
public class InsertingArrayPrintingArray {
	public static void main(String[] args){
		System.out.println("enter Array size");
		Scanner sc = new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int [] arr = new int [size];
		//insertion logic
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(10*Math.random());
		}
		//printing logic
		for(int p : arr){
		System.out.print(p+"\t");

		}
		}
	}

