package co.in.rays.ForLoop;

public class LowBattery{

public static void main(String[] args){

int charge;

for(charge=100; charge>=1; ){

	if(charge==20){
	System.out.println("Low Battery");
	charge--;
	}
	charge--;
}
System.out.println("Switch off ");
}
}