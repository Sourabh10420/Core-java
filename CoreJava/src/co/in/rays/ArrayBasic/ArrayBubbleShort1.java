package co.in.rays.ArrayBasic;
import java.util.Scanner;
	public class ArrayBubbleShort1 {
		public static void main(String[] args) {
			System.out.println("Enter Array Size");
			Scanner sc = new Scanner(System.in);
			int size,temp,flag = 0;
			size = sc.nextInt();
			int [] a = new int [size];
				System.out.println("Enter Elements In Array");
					for (int i = 0; i <a.length; i++) {
						a[i]=sc.nextInt();
						}
							System.out.println("print Negetive elements");
									for (int i = 0; i < a.length; i++) {
										if(a[i]<0) {
											System.out.print(a[i]+",");
										}
									}
							
						System.out.println("\n"+"Print Elements In Bubble Short ");
						
							for (int i = 0; i <a.length; i++) {
								for (int j = 0; j <a.length-1-i; j++) {
									if(a[j]>a[j+1]) {
											temp=a[j];
											a[j]=a[j+1];
											a[j+1]=temp;
											flag=1;
									}
								}
								if(flag==0) {
								break;
								}
							}
									for (int i = 0; i <a.length; i++) {
											System.out.print(a[i]+",");
					}
		}
		
		}

