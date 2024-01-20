//Q.4Write a program to find maximum and minimum element in an array. - using
	//recursion
package co.in.rays.ArrayShit1;

public class MaximumMinimumArray {
	
	public static void main(String [] args){
		int maximum=maximum(0);
		int minimum=minimum(0);
		System.out.println("The Maximum element in Array is : "+maximum);
		System.out.println("The Minimum element in Array is : "+minimum);
		}
		static int [] arr={10,12,54,35,45,36,3};
		static int maximum=0;
		static int minimum=arr[0];
		public static int maximum(int a){
		if(a<arr.length){
			if(maximum<arr[a]){
			maximum=arr[a];
			}
		a++;
		maximum(a);
		}
		return maximum;	
		}
		public static int minimum(int a){
		if(a<arr.length){
			if(minimum>arr[a]){
			minimum=arr[a];
			}
		a++;
		minimum(a);
		}
		return minimum;	
		}
	}

