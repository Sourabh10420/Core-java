package in.co.rays.basics;
	public class MissingNumberBasic {
		public static void main(String[] args) {
			int a = 5465443;
			int b = 5465448;
			int sum = 0;
			int sum1 = 0;
			int count = 0;
			int count1 = 0;
			int c = 0;
			int c1 = 0;
				for (int i = 1; i <a; i++) {
					c = a%10;
					sum = sum+c;
					a= a/10;
				}
					for (int i = 1; i <b; i++) {
					c1= b%10;
					sum1= sum1+c1;
					b=b/10;
					}
					
					System.out.println(sum1-sum);
				}
	
		}
