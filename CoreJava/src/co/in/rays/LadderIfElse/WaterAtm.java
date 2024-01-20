package co.in.rays.LadderIfElse;
public class WaterAtm{
public static void main(String[] args){

int amount=1;//in rupies

if(amount==1){
	System.out.println("1 litter water");
}
else if(amount==5){

	System.out.println("10 litter water");
}
else if(amount==10) {
	System.out.println("20 litter water ");
}
else{
	System.out.println("Only accept 1 , 5 and 10 rupies coin ");
}
}
}