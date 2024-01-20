package co.in.rays.ArrayBasic;

public class Array2d {
	public static void main(String[] args) {
		int[][]arr = new int[5][5];
		//insertion logic
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j]=(int)(Math.random()*100);
				}
			}
		//printing logic
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
}
