package co.in.rays.ArrayShit1;
import java.util.Scanner;
public class ArrayTest1 {
	public static void main(String[] args){
		System.out.println("Enter Array Size");
			Scanner Sc=new Scanner(System.in);
			int size =Sc.nextInt();
			int [] arr = new int [size];
			System.out.println("Print Element Random");
			for(int i=0; i<arr.length; i++){
					arr[i]=(int)(10*Math.random());
				}
				for(int p : arr){
				System.out.print(p+"\t");
				}
				System.out.println();
				System.out.println("Print Delete Element");
			int position=Sc.nextInt();
				if(position<arr.length){
					for(int j=0; j<arr.length; j++){
						if(j!=position){
						System.out.print(arr[j]+"\t");
						}
						
					}
				}
				else{
				System.out.println("please enter a correct position ,given position does not exist in array ");
				}
				
			}
		}



