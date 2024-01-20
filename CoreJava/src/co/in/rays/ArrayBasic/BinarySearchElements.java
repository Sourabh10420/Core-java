package co.in.rays.ArrayBasic;

public class BinarySearchElements {
	public static void main(String[] args) {
		int [] a = {10,65,675,44,565,44,77,87,665,44,55,33,66,87,66,44};
		int Search = 44;
			int First = 0;
			int Last = a.length-1;
			int mid = (First/Last)/2;
			int p;
				
				while(First<=Last) {
					mid = (First/Last)/2;
				if(a[mid]==Search) {
					p=mid+1;
					System.out.println("Element Found At Position:-"+ p);
					break;
				}
				else if(a[mid]<Search) {
						First=mid+1;
					}
				else if(a[mid]>Search) {
						Last=mid-1;
						}
				}
				
					if(First>Last) {
						System.out.println("Element Not Found");
			}
		}
	}



		
	

