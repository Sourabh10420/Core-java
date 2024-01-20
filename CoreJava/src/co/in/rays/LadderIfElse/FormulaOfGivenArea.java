package co.in.rays.LadderIfElse;
public class FormulaOfGivenArea{
public static void main(String[] args){

String sabe="Triangle";

if(sabe=="Triangle"){
	System.out.println("Area = 1/2*Height*base");
}
else if(sabe=="rectangle"){
	System.out.println("Area = length*breadth");
}
else if(sabe=="circle"){
	System.out.println("Area = pai*redius*redius");//pai==3.141
}
else{
	System.out.println("Please enter correct sabe name");
}
}
}