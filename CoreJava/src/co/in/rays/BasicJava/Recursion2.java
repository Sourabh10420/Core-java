package co.in.rays.BasicJava;
public class Recursion2{

	public static int sumOfNumbers(int i){
	
		if(i<=n){
			sum=sum+i;
			sumOfNumbers(i+1);
		}
	return sum;
	}
	static int n=5;
	static int sum=0;
	public static void main(String[] args){
	sum=sumOfNumbers(1);
	System.out.println("sum of given first "+n+" Numbers is = "+sum);
	}
}