package co.in.rays.BasicJava;
public class Recrsion{

	public static void natural(int a){
	
		if(a<=50){
		System.out.println(a);
		a++;
		natural(a);
		}
	
	}
	public static void main(String[] args){
	
	natural(1);
	}
}