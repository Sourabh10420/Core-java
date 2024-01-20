package co.in.rays.ArrayShit1;
//Q18.Write a program to search an element in an array.
import java.util.Scanner;
public class ElementSearchingArray {
	public static void main(String[] args){
		System.out.println("enter Array Size");
			Scanner sc = new Scanner(System.in);
			int size;
			size =sc.nextInt();
			int [] arr = new int[size];
			System.out.println("print element");
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(+arr[i]+",");
			}
			int element=0;
			System.out.println("\n"+"pleas enter search element");
			element=sc.nextInt();
			for(int i=0; i<element; i++){
					if(arr[i]==element) {
						
						System.out.println("Searching element found index = "+i);
					}
					
					else {
				System.out.println("\n"+"Searching element not found in Array ");
		
					}
					
				}
			
		}
	}



