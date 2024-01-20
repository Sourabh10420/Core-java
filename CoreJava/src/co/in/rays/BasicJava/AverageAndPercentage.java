package co.in.rays.BasicJava;
public class AverageAndPercentage{
public static void main(String[] args){

int subject1,subject2,subject3,subject4,subject5,total;
double average, percentage;
	subject1=85;
	subject2=75;
	subject3=89;
	subject4=66;
	subject5=87;
	total=subject1+subject2+subject3+subject4+subject5;
	percentage=total/5;
System.out.print("Total Marks of All Subject is :");
System.out.println(total);
System.out.print("percentage is :");
System.out.println(percentage);
}
}