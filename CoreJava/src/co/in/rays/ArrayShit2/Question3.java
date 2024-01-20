package co.in.rays.ArrayShit2;
//Q4. Write a Java program to calculate the average value of array element
public class Question3 {
	public static void main(String[] args){
			int [] prs=new int[Integer.parseInt(args[0])];
		double average=0;
		int sum=0;
			for(int i=0; i<prs.length; i++){
				prs[i]=(int)(10*Math.random());
				sum=sum+prs[i];
			}
			System.out.println("     Array     ");
			for(int r:prs){
			System.out.print(r+"\t");
			}
			average=sum/prs.length;
			System.out.println("\nThe Average Value of array element is "+average);
		}
	}

