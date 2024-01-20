package co.in.rays.BasicJava;
public class Suraj{
	public static void main(String [] args){
	char ch='A';
		for(int i=1; i<=5; i++){
			for(int j=1; j<=9; j++){
				if(j>=6-i && j<5+i){
				System.out.print(ch);
				ch++;
				}
				else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}