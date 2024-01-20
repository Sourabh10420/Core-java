package co.in.rays.BasicJava;
public class Factorial{

	public static int fact(int n){
	
		if(n==1){
		return 1;
		}
		else{
		n=n*fact(n-1);
		}
	return n;
	}
	public static void main(String[] args){
	
	int f=fact(5);
	System.out.println(f);
	}
}