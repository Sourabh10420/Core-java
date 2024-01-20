package co.in.rays.BasicJava;
public class MethodQ2{

	public static int factorial(int number){
	
		int fact=1;
		for(int i=1; i<=number; i++){
		fact=fact*i;
		}
		return fact;
	}
	public static void primeNumber(int number){
	
		if(number%2!=0 && number%3!=0 && number%5!=0){
		System.out.println("given NUmber "+number+" is a prime number");
		}
		else{
		System.out.println("given NUmber "+number+" is not a prime number");
		}
	}
	public static void armstrongNumber(int number){
	
		int arm=number;
		int count=0;
		for(int i=0; arm>=1; i++){
			arm=arm/10;
			count++;
		}
		int sum=0;
		arm=number;
		for(int j=1; arm>=1; j++){
		int digit=arm%10;
		int a=1;
			for(int k=1; k<=count; k++){
			   a=a*digit;
			}
		sum=sum+a;
		arm=arm/10;
		}
		if(sum==number){
		System.out.println("given NUmber "+number+" is a armstrong number");
		}
		else{
		System.out.println("given NUmber "+number+" is not a armstrong number");
		}
	}
	public static void strongNumber(int number){
	
		int strong=number;
		int digit=0;
		int totalFact=0;
		for(int i=1; strong>=1; i++){
			int fact=1;
			digit=strong%10;
			for(int j=1; j<=digit; j++){
				fact=fact*j;
			}
			totalFact=totalFact+fact;
			fact=1;
			strong=strong/10;
		}
		if(totalFact==number){
			System.out.println("given Number "+number+" is a Strong Number");
		}
		else{
			System.out.println("given Number "+number+" is not a Strong Number");
		}
	}
	public static void main(String [] args){
	
		int f = factorial(Integer.parseInt(args[0]));
		System.out.println(f);
		
		primeNumber(Integer.parseInt(args[1]));
		armstrongNumber(Integer.parseInt(args[2]));
		strongNumber(Integer.parseInt(args[3]));
	}

}