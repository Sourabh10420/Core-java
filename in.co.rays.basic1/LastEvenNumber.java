//Take a number (say 'n') , calculate the 'nth' even numbers, print it on the screen
import java.util.Scanner;
public class LastEvenNumber{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
			for(int i=1;a>0;i++){
				if(a%2==0){
				a--;
				}
				if(a==0){
				System.out.println(i);
				}
			}
		
	}
}