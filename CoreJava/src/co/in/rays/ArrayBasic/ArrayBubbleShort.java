package co.in.rays.ArrayBasic;

public class ArrayBubbleShort {
	public static void main(String[] args) {
		int copy = 0;
		int[]a = {23,54,76,34,12};
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]>a[j]) {
					copy = a[i];
					a[i]=a[j];
					a[j]=copy;
					}
				}
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}
				
	}


