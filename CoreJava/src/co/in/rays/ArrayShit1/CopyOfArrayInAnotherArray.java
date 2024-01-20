//Q8. Write a program to copy all elements from an array to another array
package co.in.rays.ArrayShit1;
import java.util.Scanner;
public class CopyOfArrayInAnotherArray {
	public static void main(String[] args){
		System.out.println("enter size of array");
		Scanner sc = new Scanner(System.in);
		int size,temp;
		size=sc.nextInt();
		int [] arr = new int [size];
		int []copyArr=new int[arr.length];
		for(int i=0;i<arr.length; i++){
			arr[i]=(int)(Math.random()*100);
		}
		
		System.out.println("Given array is :");
		for(int p:arr){
		System.out.print(p+"\t");
		}
		System.out.println("\nCopy of Array arr ");
		for(int j=0; j<copyArr.length; j++){
			copyArr[j]=arr[j];
		}
		for (int i = 0; i < copyArr.length; i++) {
			for (int j = i+1; j < copyArr.length; j++) {
				if(copyArr[j]<copyArr[i]) {
				temp = copyArr[i];
				copyArr[i]=copyArr[j];
				copyArr[j]=temp;
				}
			}
		}
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i]+",");
		}
	}
		
	
}	


