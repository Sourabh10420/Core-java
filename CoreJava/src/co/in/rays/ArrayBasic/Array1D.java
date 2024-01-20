package co.in.rays.ArrayBasic;

public class Array1D {
		public static void main(String[] args) {
			
			int[] a = {20,30,50,60,70};
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
					sum=sum+a[i];
				
				System.out.println(a[i]);
				
			}
			System.out.println(sum);
		}
	}
