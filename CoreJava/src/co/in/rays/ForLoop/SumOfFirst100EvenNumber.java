package co.in.rays.ForLoop;

public class SumOfFirst100EvenNumber{

public static void main(String[] args){

int i=0;
int n=2;
int sum=0;

for(i=0; i<100; i++){
sum=sum+n;
n=n+2;

}
System.out.println("The Sum of First 100 Even Number is : "+sum);

}
}