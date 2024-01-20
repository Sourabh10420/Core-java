package co.in.rays.ArrayBasic;

public class Array2d1 {
	public static void main(String[] args) {
		int [][] a = new int[4][4];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j]=(int)(Math.random()*1000);
					System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
			
	}
}	