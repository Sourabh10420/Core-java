package co.in.rays.ArrayShit2;
//Q2. Write a Java program to sum values of an array. 

public class Question1 {
	public static void main(String [] args){
		int [] ps=new int[Integer.parseInt(args[0])];
		int sum=0;
			for(int i=0; i<ps.length; i++){
				ps[i]=(int)(10*Math.random());
			}
			System.out.println("Array is a : ");
			for(int r : ps){
			System.out.print(r+"\t");
			sum=sum+r;
			}
			System.out.println("\nThe sum of given Array is = "+sum);
			
		}
	}

