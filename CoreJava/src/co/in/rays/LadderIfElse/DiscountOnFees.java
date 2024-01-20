package co.in.rays.LadderIfElse;
public class DiscountOnFees{
public static void main(String[] args){
int marks=80;
if(marks>=80){
	System.out.println("your fees is 90% off ");
}
else if(marks>=75){
	System.out.println("your fees is 70% off");
}
else if(marks>=70){
	System.out.println("your fees is 40% off");
}
else{
	System.out.println("no Discount , Please pay full fees");
}
}
}