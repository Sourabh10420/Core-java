package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class MergeTwoArray {
	public static void main(String[] args) {
		System.out.println("Enter Aray1 size");
		Scanner sc = new Scanner(System.in);
		int size1,size2;
		size1 = sc.nextInt();
		System.out.println("enter Aray 2 size");
		size2 = sc.nextInt();
		int [] arr1 = new int[size1];
		int [] arr2 = new int[size2];
		System.out.println("Print array1 Element Random");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
			
			System.out.print(arr1[i]+",");
		}
		System.out.println("\n"+"Print Array2 Element Random");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]= (int)(Math.random()*10);
			System.out.print(+arr2[i]+",");
		}
		int [] arr3 =new int[arr1.length+arr2.length];
		for (int k = 0; k < arr3.length; k++) {
				for (int i = 0; i < arr1.length; i++) {
					arr3[k]=arr1[i];
					k++;
				}
				for (int j = 0; j < arr2.length; j++) {
					arr3[k]=arr2[j];
					k++;
				}
		
		}
		System.out.println("\n"+"Print merg Third Array Element");
		for (int a : arr3) {
			System.out.print(a+",");
			
		} 
			 
			
	}
			
			
}

