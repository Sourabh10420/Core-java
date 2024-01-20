package co.in.rays.BasicJava;
public class DigitOFNumber{
	
	static int count=0;
	public static int digitCount(int number){
	
		if(number>=1){
			number=number/10;
			count++;
			digitCount(number);

		}
		return count;		
	}
	public static void main(String [] args){
	
		int digit=digitCount(Integer.parseInt(args[0]));
		System.out.println(digit);
		
	}

}