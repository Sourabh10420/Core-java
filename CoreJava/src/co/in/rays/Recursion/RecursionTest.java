package co.in.rays.Recursion;

public class RecursionTest {
	
		static int i = 1;
		public static void printing() {
			System.out.println(i+ " "+ "Hellow Sourabh");
		
			if(i<6) {
				i++;
				printing();
			}	
		}
		public static void main(String[] args) {
			printing();
		}
}
