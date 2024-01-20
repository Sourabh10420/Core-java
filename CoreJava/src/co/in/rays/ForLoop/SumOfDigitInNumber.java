package co.in.rays.ForLoop;

public class SumOfDigitInNumber{

public static void main(String[] args){

int number=158;
int sum=0,digit;
for(int i=1; number>=1; i++){
	digit=number%10;
	sum=sum+digit;
	number=number/10;
}
System.out.println("Sum Of All Digit in a given Number is = "+sum);
}

}