package co.in.rays.Array;

public class ArrayTest5 {
	public static void main(String [] args){

		int[][] pr=new int[4][3];
		int element=0;
		
		for(int i=0; i<pr.length; i++){
			
			for(int j=0; j<pr[i].length; i++){
				element=element+2;
				pr[i][j]=element;
			}
		}
		for(int i=0; i<pr.length; i++){
			
			for(int j=0; j<pr[i].length; j++){
			System.out.print(pr[i][j]+"\t");
			}
		System.out.println();
		}
	}


}
