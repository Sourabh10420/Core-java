package co.in.rays.ForLoop;

public class SumOfFirst100OddNumber{

public static void main(String[] args){

int i;
int n=1;
int sum=0;

for(i=0; i<100; i++){
sum=sum+n;
n=n+2;

}
System.out.println("The Sum of First 100 Even Number is :"+sum);

}
}