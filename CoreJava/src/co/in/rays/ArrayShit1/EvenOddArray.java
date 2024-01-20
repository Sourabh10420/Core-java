	//Q6. Write a program to count total number of even and odd elements in an array
	
package co.in.rays.ArrayShit1;

	public class EvenOddArray {
		public static void main(String [] args){
		int [] arr= {10,20,39,45,76,56,34,33,66};
		for(int i=0; i<arr.length; i++){
			
		}
		System.out.println("Given Array is : ");
		for(int p: arr){
		System.out.print(p+"\t");
		}
		int even=0;
		int odd=0;
		for(int p: arr){
			if(p%2==0){
			even++;
			}
			else{
			odd++;
			}
		}
		
		System.out.println("\nThe total Number of even Elements is "+even);
		System.out.println("The total Number of odd Elements is "+odd);
		
		}
	}

