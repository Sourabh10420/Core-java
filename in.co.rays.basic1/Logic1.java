import java.util.Scanner;
public class Logic1{
	public static void main(String[] args){
		Scanner kb =new Scanner (System.in);
		System.out.println("Enter two numbers");
		int a,b;
		a=kb.nextInt();
		b=kb.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
}