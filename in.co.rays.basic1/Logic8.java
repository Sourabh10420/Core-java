import java.util.Scanner;
public class Logic8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a=sc.nextInt();
			if(a%2==0){
			a=a+1;
			}
			for(int i=0;i<=a;i++){
				System.out.println(a+i);
			}
		
	}
}