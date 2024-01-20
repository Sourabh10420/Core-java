package co.in.rays.BasicLoops;

public class Pattern9 {

	public static void main(String [] args){

	for(int i=1; i<5; i++){
		 
		for(int j=1; j<=7; j++){
		
			if(j>=5-i &&j<=3+i)
			System.out.print("A");
			else
			System.out.print(" ");
		}
	System.out.println();
	}
	for(int p=1; p<=3; p++){

		for(int r=1; r<=7; r++){
			if(r>=0+p && r<=6-p)
			System.out.print("A");
			else
			System.out.print(" ");
		}
	System.out.println();
	}
	}

	}

