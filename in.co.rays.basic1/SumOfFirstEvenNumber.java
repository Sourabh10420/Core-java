//Take a number (say 'n') , calculate sum of first 'n' even numbers, print it on the screen 
import java.util.Scanner;
public class SumOfFirstEvenNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println(a*(a+1));			
	}
}
