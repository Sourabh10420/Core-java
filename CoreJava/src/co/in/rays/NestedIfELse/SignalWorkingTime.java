package co.in.rays.NestedIfELse;
public class SignalWorkingTime{

public static void main(String[] args){

double time=12.30;

if(time>7){
	if(time<23.30){
	System.out.println("Signal is proper working According time period");
	}
	else{
	System.out.println("Signal is orange in this time period");
	}
}
else{
System.out.println("Signal is orange in this time");
}
}
}