package co.in.rays.Array;

public class JaggedArrayMarks {
	public static void main(String[] args) {
	
			int [][] a = new int[5][];
			
		a[0] = new int [6];
		a[1] = new int [4];
		a[2] = new int [3];
		a[3] = new int [5];
		a[4] = new int [3];
		
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					a[i][j] = (int)(Math.random()*100);
				}
			}
			int m =1;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a[i].length; j++) {
						System.out.print(m+" "+"marks("+a[i][j]+")"+"\t");
						m++;
					}
					System.out.println("\n");
				}
					
		}
				
	}

