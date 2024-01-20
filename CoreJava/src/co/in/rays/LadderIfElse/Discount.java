package co.in.rays.LadderIfElse;
public class Discount{
public static void main(String[] args){

int amount=3000;//in cc

if(amount<=1000){
	System.out.println("5% Discount on MRP ");
}
else if(amount<=2500){

	System.out.println("25% Discount on MRP");
}
else if(amount<=5000) {
	System.out.println("35% Discount on MRP ");
}
else{
	System.out.println("40% Discount on MRP ");
}
}
}