package co.in.rays.ArrayShit1;
//Q14.Write a program to delete all duplicate elements from an array
import java.util.Scanner;
	public class Question13 {

		public static void main(String[] args){
			System.out.println("Enter Size Of Array");
			Scanner sc = new Scanner(System.in);
			int size;
			size=sc.nextInt();
			int [] arr = new int[size];
		int duplicate=0;
			System.out.println("Print Element Randomly");
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
				System.out.print( arr[i]+"\t");
			}
		System.out.println("\n"+"Array Before deleteing a duplicat element : ");
			for(int p : arr){
				System.out.print(p+"\t");
			}
			System.out.println("\n"+"Array After Delete Duplicate Element");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(duplicate!=arr[i]) {
						System.out.print(duplicate+",");
					}
				}
			}
		
		}
	}

