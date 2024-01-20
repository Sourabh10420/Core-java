package co.in.rays.ForLoop;

public class FFALD{
//FFALD means finnd first and last digit
	public static void main(String [] args){
	
	int number=12315;
	int n=number;
	int firstDigit=0,lastDigit,count=0;
	lastDigit=number%10;
		for(int i=0; number>=1; i++){
		number=number/10;
		count++;
		}
	System.out.println("last digit of a given number is = "+lastDigit);
		for(int i=1; i<count-1; i++){
		firstDigit=number/10;
		}
	System.out.println("last digit of a given number is = "+firstDigit);
	}

}