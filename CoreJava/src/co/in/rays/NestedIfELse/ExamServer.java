package co.in.rays.NestedIfELse;
public class ExamServer{

public static void main(String[] args){

double time=9.00;//time
double startingTime=8.30;// time
double examDuration=11.30;//time
if(time>=startingTime){
	if(time<=examDuration){
	System.out.println("exam in running");
	}
	else{
	System.out.println("exam is over");
	}
}
else{
System.out.println("exam not a start,please wait");
}
}
}