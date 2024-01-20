package in.co.rays.basics;

public class ModrateForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			
				for (int j = 1; j <= (i * -2 + 8); j++) {
					System.out.print(" ");
				}
					System.out.print("<>");
			for (int k = 1; k <= (i * 4 - 4); k++) {
							System.out.print(".");
			}
							System.out.print("<>");
					for (int j = 1; j <= (i * -2 + 8); j++) {
							System.out.print(" ");
			}
			System.out.println(" ");
	}
}
}			