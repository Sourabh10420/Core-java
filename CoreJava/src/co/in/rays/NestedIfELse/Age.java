package co.in.rays.NestedIfELse;
public class Age{

public static void main(String[] args){

int age=16;

if(age>0){
	if(age<=5){
	System.out.println("You are baby boy/girl");
	}
	else if(age<=13){
	System.out.println("you are children");
	}
	else if(age<=19){
	System.out.println("you are teeneger");
	}
	else if(age<=45){
	System.out.println("you are adult");
	}
	else if(age<=60){
	System.out.println("you are middle Adult");
	}
	else{
	System.out.println("you are senior citizen");
	}
}
else{
System.out.println("you are not born ");
}
}
}