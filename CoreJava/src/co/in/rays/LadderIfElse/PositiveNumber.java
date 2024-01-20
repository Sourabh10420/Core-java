package co.in.rays.LadderIfElse;
public class PositiveNumber{

public static void main(String[] args){

int number=100;

if (number>=0&&number<=9){
	System.out.println(" The Given Positive NUmber is a single digit Number");
}
else if(number>=10&&number<=99){
	System.out.println(" The Given Positive NUmber is double digit Number");
}
else if(number>=100&&number<=999){
	System.out.println(" The Given Positive NUmber is triple digit Number");
}
else if(number>=1000&&number<=9999){
	System.out.println(" The Given Positive NUmber is Four digit Number");
}
else if(number>=10000&&number<=99999){
	System.out.println(" The Given Positive NUmber is Five digit Number");
}
else if(number>=10000){
	System.out.println(" The Given Positive NUmber is multiple digit Number");
}
else{
	System.out.println(" The Given  NUmber is not a positive Number");
}
}
}