package co.in.rays.ArrayBasic;

public class JaggedArray1 {
	public static void main(String[] args) {
		int[][] a = new int[6][];
		a[0] = new int[5];
		a[1] =  new int[9];
		a[2] =  new int[5];
		a[3] =  new int[3];
		a[4] =  new int[5];
		a[5] =  new int[6];
			int m = 0;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						a[i][j] = (i+1)*(j+1);
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
