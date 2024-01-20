package co.in.rays.LadderIfElse;
public class Grading{

public static void main(String[] args){

int marks=27;

if(marks>=95){
	System.out.println("You are pass in A+ Grade");
}
else if(marks>=75){
	System.out.println("You are pass in A Grade");
}
else if(marks>=60){
	System.out.println("You are pass in B Grade");
}
else if(marks>=45){
	System.out.println("You are pass in c Grade");
}
else if(marks>=33){
	System.out.println("You are pass in D Grade ");
}
else{
	System.out.println("You are fail");
}
}
}