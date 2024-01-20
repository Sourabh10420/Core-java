package co.in.rays.LadderIfElse;
public class IncomeTax{
public static void main(String[] args){
int income=30000;

if(income<300000){
	System.out.println("NO tax ");
}
else if(income<=500000){
	System.out.println("5% tax on income");
}
else if(income<=1000000){
	System.out.println("20% tax on income");
}
else{
	System.out.println("30% tax on income");
}
}
}