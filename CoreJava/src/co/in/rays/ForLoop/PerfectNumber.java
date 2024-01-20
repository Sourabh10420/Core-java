package co.in.rays.ForLoop;

public class PerfectNumber{

	public static void main(String [] args){
	
	int number=8128;
	int i=1;
	int sum=0;
		for(i=1; i<number; i++){
		if(number%i==0)
		//System.out.println(i);
		sum=sum+i;
		}
	if(sum==number)
	System.out.println("given Number "+number+" is a perfect Number");
	else
	System.out.println("given Number "+number+" is not perfect Number");
	}

}