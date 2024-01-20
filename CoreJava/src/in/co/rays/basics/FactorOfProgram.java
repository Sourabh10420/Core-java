package in.co.rays.basics;
public class FactorOfProgram {
	public static void main(String[] args) {
		
	int num = 36;
	int sum = 0;
	
			System.out.println("Factorof" + num + "are :");
			for(int i =1; i<=num;i++) {
				if(num%i==0) {
					sum = sum+i;
					System.out.println(i);
				}			
			}
			System.out.println(sum);
	}
}
	
