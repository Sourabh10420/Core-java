package co.in.rays.ForLoop;

public class Rombus1 {
	public static void main(String [] args){

		for(int i=1; i<=5; i++){
			for(int j=i; j>=1; j--){
			System.out.print(" ");
			}
			for(int k=5; k>=i; k--){
			System.out.print("*");
			}
			//for(int j=5; j>=1; j--){
			//System.out.print(" ");
			//}
			for(int k=1; k<=i; k++){
			System.out.print("*");
			}
		System.out.println();
		}
		}

		}

