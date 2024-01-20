package co.in.rays.ForLoop;

public class ASNumber{
	
	public static void main(String[] args){
	
	int number=135;
	int num=number;
	int digit=0;
	int totalCube=0;
		for(int i=1; number>=1; i++){
			int cube=1;
			digit=number%10;
			for(int j=1; j<=3; j++){
				cube=cube*digit;
			}
			totalCube=totalCube+cube;
			number=number/10;
		}
		if(num==totalCube){
			System.out.println("given number is a Armstrong number");
		}
		else{
			System.out.println("given number is not a Armstrong number");
		}
	
	}	
}