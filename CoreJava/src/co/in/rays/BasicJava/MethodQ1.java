package co.in.rays.BasicJava;
public class MethodQ1{
	
	public static void addition(int a,int b){
		int sum=a+b;
		System.out.println("Addition of given number is : "+sum);
	}
	public static void substraction(int a, int b){
		int sub=a-b;
		System.out.println("Addition of given number is : "+sub);
	}
	public static void multiplication(int a, int b){
		int multiple=a*b;
		System.out.println("multiplication of given number is : "+multiple);
	}
	public static void division(int a, int b){
		int div=a/b;
		System.out.println("division of given number is : "+div);
	}
	public static void modules(int a, int b){
		int mod=a%b;
		System.out.println("modules of given number is : "+mod);
	}
	public static void main(String[] args){
	
		addition(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		substraction(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		multiplication(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		division(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

		modules(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}