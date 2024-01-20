package co.in.rays.BasicJava;
public class RecursionQ4{

	public static void main(String[] args){
	
	table(6);
	
	}
	static int count=1;
	public static void table(int n){
	
		if(count<=10){
		System.out.println(n+" x "+count+" = "+n*count);
		count++;
		table(n);
		}	
	}
}