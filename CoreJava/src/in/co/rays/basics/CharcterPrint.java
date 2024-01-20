package in.co.rays.basics;

public class CharcterPrint {
	public static void main(String[] args) {
		char ch = 65;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i>=j) {
					System.out.print(ch);
				ch++;
				}
				
			}
			System.out.println();
		
		}
	}
}
