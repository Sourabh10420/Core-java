//Take a number (say 'n') , calculate the 'nth' odd number, print it on the screen 
import java.util.Scanner;
public class LastOddNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
			for(int i=1;a>0;i++){
				if(i%2!=0){
				a--;
				}
				if(a==0){
				System.out.println(i);
				}
			}
	}
}