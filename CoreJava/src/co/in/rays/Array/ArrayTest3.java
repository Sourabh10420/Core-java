package co.in.rays.Array;

public class ArrayTest3 {
	public static void main(String[] args){
		
		int[][][] pr=new int[5][4][3];
		int element=0;
		
		for(int i=0; i<pr.length; i++){
		
			for(int j=0; j<pr[i].length; j++){
			
				for(int k=0; k<pr[i][j].length; k++){
				
					element=element+10;
					pr[i][j][k]=element;
				}
			}
		}
		for(int i=0; i<pr.length; i++){
		
			for(int j=0; j<pr[i].length; j++){
			
				for(int k=0; k<pr[i][j].length; k++){
				
				System.out.print(pr[i][j][k]+"\t");
				}
			System.out.println();
			}
		System.out.println();
		}
		}

	}

