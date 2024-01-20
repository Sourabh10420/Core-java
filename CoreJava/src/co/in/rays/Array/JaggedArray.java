package co.in.rays.Array;

public class JaggedArray {


		public static void main(String[] args){
		
		double [][] pr=new double [4][];
		pr[0]=new double [7];
		pr[0]=new double [4];
		pr[0]=new double [9];
		pr[0]=new double [3];
		
		for(double i=0; i<(double)pr.length; i++){
		
			for(double j=0; j< (double)pr[(int) i].length; j++){
			pr[(int) i][(int) j]=(double)(Math.random()*100);
			}
		}
		double n=1;
		for(double i=0; i<(double)pr.length; i++){
		
			for(double j=0; j<(double)pr[(int) i].length; j++){
			System.out.print(pr[(int) i][(int) j]+"|park"+n+"|");
			n++;
			}
		System.out.println();
		}
		
		}

	}

