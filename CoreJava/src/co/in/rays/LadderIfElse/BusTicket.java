package co.in.rays.LadderIfElse;
public class BusTicket{
public static void main(String[] args){

double distance=2;//in km

if(distance<=2.5){
	System.out.println("ticket amount is 5 rupies");
}
else if(distance<=4){

	System.out.println("ticket amount is 10 rupies");
}
else if(distance<=8) {
	System.out.println("ticket amount is 20 rupies ");
}
else{
	System.out.println("ticket amount is 25 rupies ");
}
}
}