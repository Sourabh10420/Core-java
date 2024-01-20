//Q7. Write a program to count total number of negative elements in an array.


package co.in.rays.ArrayShit1;

public class TotalNegetiveElement {
	
		public static void main(String [] args){
		int [] arr = {34,-54,-76,-55,-23,65,76,-88,-99,45};

		int count = 0;
		System.out.println("given array is : ");
		for(int p: arr){
		System.out.print(p+"\t");
			if(p<0){
			count++;
			}
		}
		System.out.println("\nThe total Number of Negative elements is = "+count);
		}
	}


