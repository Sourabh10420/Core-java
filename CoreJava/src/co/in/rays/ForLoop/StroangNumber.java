package co.in.rays.ForLoop;
public class StroangNumber{

	public static void main(String [] args){
	
	int number=154;
	int result=number;
	int digit=0;
	int totalFact=0;
		for(int i=1; number>=1; i++){
			digit=number%10;
			int fact=1;
			System.out.println(digit);
			for(int j=1; j<=digit; j++){
			fact=fact*j;
			
			}
			number=number/10;
			totalFact=totalFact+fact;
		}
		if(totalFact==result){
		System.out.println("givin number is a stroang number");
		}
		else{
		System.out.println("givin number is not a stroang number");
		}
	}

}