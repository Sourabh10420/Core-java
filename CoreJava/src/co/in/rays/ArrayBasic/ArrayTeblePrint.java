package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayTeblePrint {
	
		public static void main(String[] args) {
			System.out.print("Enter Size of Array");
			Scanner sc = new Scanner(System.in);
			int size,size1;
			size1=sc.nextInt();
			size = sc.nextInt();
			int [][]a = new int[size][size1];
			
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < a.length; j++) {
						a[i][j]= (i+1)*(j+1);
							System.out.print(a[i][j]+"\t");
					}
				System.out.println();
				}
				
		}
	

	}
