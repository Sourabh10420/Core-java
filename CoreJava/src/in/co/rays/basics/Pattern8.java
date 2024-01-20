package in.co.rays.basics;

public class Pattern8 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			int x = 5;
				for (int j = 1; j <=9; j++) {
					if(i== 5 ||  j==x-i|| j== x+i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
					System.out.println();
		}
	}
}
