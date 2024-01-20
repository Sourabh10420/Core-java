package in.co.rays.basics;

	public class Pattern7 {
		public static void main(String[] args) {
			int x =5;
			for (int i=1;i<=5;i++) {
				for (int j = 1; j <=x;j++) {
				
					if(i==5||j==5||j<=6-i) {
						
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