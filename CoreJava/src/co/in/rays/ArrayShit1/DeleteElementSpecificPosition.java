package co.in.rays.ArrayShit1;
//Q10.Write a program to delete an element from an array at specified position.
import java.util.Scanner;
public class DeleteElementSpecificPosition {
	public static void main(String[] args){
			System.out.println("Enter Array size");
			Scanner sc = new Scanner(System.in);
			int size;
			size =sc.nextInt();
			int [] arr = new int [size];
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			for(int p : arr){
			System.out.print(p+"\t");
			}
			
			System.out.print("\n"+"Enter Delete Element");
			int position=0;
			if(position<arr.length){
				for(int j=0; j<arr.length; j++){
					if(j!=position){
					System.out.println(arr[j]+"\t");
					}
					
				}
			}
			else{
			System.out.println("please enter a correct position ,given position does not exist in array ");
			}
			
		}
	}

