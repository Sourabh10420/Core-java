package co.in.rays.ArrayBasic;
import java.util.Scanner;
public class ArrayEvenOddSeprateElement {
	public static void main(String[] args) {
		System.out.println("enter Array size");
		Scanner sc = new Scanner(System.in);
		int Size;
		int even=0,odd=0,temp,temp2;
		Size = sc.nextInt();
		int [] arr =new int[Size];
		System.out.println("print Array Element Random method");
		
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int)(Math.random()*100);
					System.out.print(arr[i]+",");
			}
				for (int i = 0; i < arr.length; i++) {
					if(arr[i]%2==0) {
						even++;
					}
					else {
						odd++;
					}
				}
			System.out.println("\n"+"Print Even Element Seprate in accending order");
			int [] arr1 = new int[even];
				for (int i = 0; i < arr1.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if(arr[j]%2==0) {
							arr1[i]=arr[j];
							i++;
						}
					}
				}
					for (int i = 0; i < arr1.length; i++) {
						for (int j = i+1; j < arr1.length; j++) {
							if(arr1[j]<arr1[i]) {
								temp2 = arr1[i];
								arr1[i]=arr1[j];
								arr1[j]=temp2;
							}
						}
					}
			for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i]+",");
				}
			System.out.println("\n"+"Print odd element Seprate in deceding order");
			int [] arr2 = new int [odd];
				for (int i = 0; i < arr2.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						if(arr[j]%2!=0) {
							arr2[i]=arr[j];
							i++;
						}
					}
				}
				for (int i = 0; i < arr2.length; i++) {
					for (int j = i+1; j < arr2.length; j++) {
						if(arr2[j]>arr2[i]) {
							temp = arr2[i];
							arr2[i]=arr2[j];
							arr2[j]=temp;
						}
					}
				}
			for (int i = 0; i < arr2.length; i++) {
					System.out.print(arr2[i]+",");
		}
	}
}
