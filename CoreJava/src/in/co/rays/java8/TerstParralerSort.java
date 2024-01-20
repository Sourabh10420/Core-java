package in.co.rays.java8;

import java.util.Arrays;

public class TerstParralerSort {
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {100,50,20,41,80};
		
		
		Arrays.parallelSort(arr);
		
		
		for (int i : arr) {
			
			
			
			System.out.println(i);
			
		}
		
		
		
	}

}
