package co.in.rays.LadderIfElse;
public class BikeAverage{
public static void main(String[] args){

int engine=125;//in cc

if(engine<=110){
	System.out.println("The maximum mileage of Bike is 75km/liter ");
}
else if(engine<=125){

	System.out.println("The maximum mileage of Bike is 65km/liter");
}
else if(engine<=150) {
	System.out.println("The maximum mileage of Bike is 50km/liter ");
}
else{
	System.out.println("The maximum mileage of Bike is 40km/liter ");
}
}
}