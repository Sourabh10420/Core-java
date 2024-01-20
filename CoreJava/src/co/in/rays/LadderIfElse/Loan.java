package co.in.rays.LadderIfElse;
public class Loan{

public static void main(String[] args){

int creditScore=750;

if(creditScore<=500){
	System.out.println("your maximum loan limit 500");
}
else if (creditScore<=700){
	System.out.println("your maximum loan limit 3000");
}
else if (creditScore<=900){
	System.out.println("your maximum loan limit 8000");
}
else if(creditScore>900){
	System.out.println("your maximum loan limit 50000");
}
else{
	System.out.println(" your credit score is 0 so your maximum loan limit 500");
}
}
}