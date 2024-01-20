package co.in.rays.NestedIfELse;
public class Grading{

public static void main(String[] args){

int marks=67;

if(marks>=33){
	if(marks<=50){
	System.out.println("D Grade");
	}
	else if(marks<=65){
	System.out.println("C Grade");
	}
	else if(marks<75){
	System.out.println("B Grade");
	}
	else if(marks<90){
	System.out.println("A Grade");
	}
	else{
	System.out.println("A+ Grade");
	}
}
else{
System.out.println("You are fail , Try again ");
}
}

}