package co.in.rays.WhileLoop;

public class LowBattery{

public static void main(String[] args){

int charge=100;

while(charge>=1){

	if(charge==20){
	System.out.println("Low Battery");
	charge--;
	}
	charge--;
}
System.out.println("Switch off ");
}
}