package co.in.rays.ArrayBasic;

public class MatrixArray {
	public static void main(String[] args) {
			int[][] a = new int [5][6];
				int k = 0;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						a[i][j]= ++k;
						
					}
				}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]+"\t");
					
				}
				System.out.println();
				
			}
			
	}
}
