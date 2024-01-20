package co.in.rays.ArrayShit2;
//Q3. Write a Java program to find the index of an array element.
public class Question2 {
	public static void main(String[] args){
		int []arr=new int[Integer.parseInt(args[0])];
		int element=Integer.parseInt(args[1]);
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			System.out.println("The Array is show in below");
			for(int r : arr){
			System.out.print(r+"\t");
			}
			for(int i=0; i<arr.length; i++){
				if(element==arr[i]){
				System.out.println("\nThe finding element "+element+" is index of "+i);
				}
			}
	}
	
}
