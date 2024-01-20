package co.in.rays.ForLoop;

public class SumOfAllOddNumber1To100{

	public static void main(String [] args){

	int oddNumber;
	int sum=0;
		for(oddNumber=0; oddNumber<100;oddNumber++){
		oddNumber=oddNumber+1;
		sum=sum+oddNumber;
		
		}
	System.out.println("Sum of all odd number is = "+sum);

}

}