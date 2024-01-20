//Take a number (say 'n') , calculate sum of first 'n' odd numbers, print it on the screen
import java.util.Scanner;
public class SumOfFirstNOddNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int a,b=0;
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Sum of odd numbers are :");
			for(int i=1;a>0;i++){
				if(i%2!=0){
				b++;
				a--;
				}
			}
		System.out.println(b*(b-1)+b);	
	}
}
