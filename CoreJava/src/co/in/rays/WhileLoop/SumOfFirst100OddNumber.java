package co.in.rays.WhileLoop;

public class SumOfFirst100OddNumber{

public static void main(String[] args){

int i=0;
int n=1;
int sum=0;

while(i<100){
sum=sum+n;
n=n+2;
i++;
}
System.out.println("The Sum of First 100 Even Number is :");
System.out.println(sum);
}
}