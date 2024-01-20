package in.co.rays.basics;

public class PattenOfA {
	public static void main(String[] args) {
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=7; j++) {
				if(i==1||i==5||j==1||j==7) {
					System.out.print('A');
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
