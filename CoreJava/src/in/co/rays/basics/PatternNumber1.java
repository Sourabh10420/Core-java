package in.co.rays.basics;

public class PatternNumber1 {
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j<=5; j++) {
				
					if (i<=5 &&j<=6-i) {
						System.out.print(j);
					}
					else {
						if(i>5&&j<=i-4) {
							System.out.print(j);
						}
						else {
							System.out.print(" ");
						}
					}
				}
		
			
			System.out.println();
		}
	}
}
