package co.in.rays.Array;

public class JaggedArray1 {

	public static void main(String[] args){
		
		int [][] arr=new int[6][];
		arr[0]=new int[5];
		arr[1]=new int[3];
		arr[2]=new int[8];
		arr[3]=new int[2];
		arr[4]=new int[7];
		arr[5]=new int[4];
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
				arr[i][j]=(int)(Math.random()*10000);
			}
		}
		int n=1;
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
			System.out.print(arr[i][j]+"|park"+n+"|\t");
			n++;
			}
		System.out.println("\n");
		}
		}

	}

