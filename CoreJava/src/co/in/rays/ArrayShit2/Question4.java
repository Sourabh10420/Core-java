package co.in.rays.ArrayShit2;
//Q10.Write a Java program to find the maximum and minimum value of an array. 

public class Question4 {
	public static void main(String [] args){
		int [] rmn=new int[Integer.parseInt(args[0])];
		
			for(int i=0; i<rmn.length; i++){
				rmn[i]=(int)(10*Math.random());
			}
			System.out.println("Array is show in below");
			for(int prs : rmn){
			System.out.print(rmn+"\t");
			}
		int minimum=rmn[0];
		int maximum=rmn[0];
			for(int i=0; i<rmn.length; i++){
				if(minimum>rmn[i]){
					minimum=rmn[i];
				}
				else if(maximum<rmn[i]){
					maximum=rmn[i];
				}
			}
		System.out.println("\nThe Maximum value an Array is = "+maximum);
		System.out.println("The Minimum value an Array is = "+minimum);
		}
	}

