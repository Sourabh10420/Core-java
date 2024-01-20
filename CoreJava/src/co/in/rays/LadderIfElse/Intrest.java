package co.in.rays.LadderIfElse;
public class Intrest{
public static void main(String[] args){

double time=2.5;//in year

if(time<=1){
	System.out.println("intrest rate in given time perioud is : 2%");
}
else if(time<=2.5){
	System.out.println("intrest rate in given time perioud is : 3%");
}
else if(time<=4){
	System.out.println("intrest rate in given time perioud is : 5%");
}
else{
	System.out.println("intrest rate in given time perioud is : 10%");	
}
}
}