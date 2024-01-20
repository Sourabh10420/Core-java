package co.in.rays.ArrayBasic;

public class Array3Dimemstion {
	public static void main(String[] args) {
		int[][][] a = new int [6][6][6];
		int m = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					for (int k = 0; k < a[j].length; k++) {
						a[i][j][k]= (i+1)*(j+1)*(k+1);
					}	
				}
			}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[j].length; k++) {
					System.out.print(a[i][j][k]+"\t");
					
				}
				System.out.println();
			}
		}
	}
}