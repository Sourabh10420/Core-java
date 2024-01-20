package in.co.rays.basics;

public class PatternABC {
	public static void main(String[] args) {
		char ch = 'a';
				for (int i = 1; i <=9; i++) {
					for (int j =1; j <=10; j++) {
						if(i<=5) {
							if((j==i)||(j==11-i)){
								System.out.print(ch);
							}
							else {
								System.out.print(" ");
							}
						}
						else {
							if((j==10-i)||(j==i+1)){
							ch--;
							System.out.print(ch);
							}
							else {
								System.out.print(" ");
							}
						}
						
					}
					ch++;
					System.out.println();
					
					
					
				}
	}
}
