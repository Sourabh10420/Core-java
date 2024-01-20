package co.in.rays.Array;

public class ArrayTest4 {
	public static void main(String [] args){

		int[][] pr=new int[4][3];
		int element=0;
		int search=12;
		for(int i=0; i<pr.length; i++){
			
			for(int j=0; j<pr[i].length; j++){
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
		for(int i=0; i<pr.length; i++){
			
			for(int j=0; j<pr[i].length; j++){
				if(search==pr[i][j]){
				System.out.println("element found at index of "+i+","+j);
				}
			}
		
		}
		}
}
