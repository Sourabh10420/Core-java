package co.in.rays.ArrayShit1;
//Q11.Write a program to count frequency of each element in an array.
import java.util.Scanner;
public class FrequncyChackEachElement {
	public static void main(String[] args){
		System.out.println("Enter size of Array");
		Scanner sc =new Scanner(System.in);
		int size;
		size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Print Random Elements");
		for(int k=0;k<arr.length; k++){
		arr[k]=(int)(10*Math.random());
		System.out.print(arr[k]+"\t");
		}
		
		System.out.println("\n"+"print friquency of each elements");
		for(int i=0; i<arr.length; i++){
			int count=0;
			for(int j=0; j<arr.length; j++){
				if(arr[i]==arr[j]){
				count++;
				}
			}
		System.out.println("frequency of "+arr[i]+" "+"is : "+count);
		}
		}
	}

