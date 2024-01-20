package co.in.rays.ArrayShit1;
//Q17.Write a program to put even and odd elements of array in two separate array
import java.util.Scanner;
public class ArrayEevnOddElementSeprate {
	public static void main(String[] args){
		System.out.println("Enter array size");
		Scanner sc =new Scanner(System.in);
		int size;
		int odd=0,even=0;
		size=sc.nextInt();
		int [] arr = new int [size];
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)(10*Math.random());
			}
			System.out.println("Array is : ");
			for(int p : arr){
				System.out.print(p+"\t");
				if(p%2==0){
					even++;
				}
				else{
					odd++;
				}
			}
		System.out.println("\nThe separate Array of even element");
		int [] arr1=new int[even];
			for(int i=0; i<arr1.length; i++){
				for(int j=0; j<arr.length; j++){
					if(arr[j]%2==0){
						arr1[i]=arr[j];
						i++;
					}
				}
			}
			for(int p : arr1){
			System.out.print(p+"\t");
			}
		System.out.println("\nThe separate Array of odd element");
		int [] arr2=new int[odd];
			for(int i=0; i<arr2.length; i++){
				for(int j=0; j<arr.length; j++){
					if(arr[j]%2!=0){
						arr2[i]=arr[j];
						i++;
					}
				}
			}
			for(int p : arr2){
			System.out.print(p+"\t");
			}
		}
	}

