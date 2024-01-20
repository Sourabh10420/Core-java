package co.in.rays.WhileLoop;

public class SumofFirst100Number{

public static void main(String[] args){

int n=1;
int sum=0;

while(n<=100){

sum=sum+n;
n++;
}
System.out.print("Sum of fist 100 number ,1 to 100 is :");
System.out.println(sum);
}
}