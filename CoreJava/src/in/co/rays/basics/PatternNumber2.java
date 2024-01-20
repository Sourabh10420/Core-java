package in.co.rays.basics;

public class PatternNumber2 {
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j =1; j <=5; j++) {
				if (i<=5) {
					if (j>=i+0) {
						System.out.print(j);
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if (j>=10-i) {
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
				
