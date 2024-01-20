package co.in.rays.ForLoop;
public class SwapFirstAndLastDigit{

	public static void main(String [] args){
	
	int number=12345;
	int firstDigit=number;
	int lastDigit=0;
	int count=0;

		lastDigit=number%10;
		for(int i=0; number>=1; i++){
		number=number/10;
		count++;
		}	
		for(int j=1; j<count; j++){
		firstDigit=firstDigit/10;
		}
	}


}