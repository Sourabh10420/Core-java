package co.in.rays.ArrayBasic;

public class SearchLinerArray {
	public static void main(String[] args) {
		int [] a = {13,34,675,45,34,87,44,33,67,88,545,33,55};
		int Search = 34;
		int k;
			for (int i = 0; i < a.length; i++) {
				if(a[i]==Search) {
					i=i+1;
					System.out.println("element fount at position:-"+ i);
					
					
				}
			}
			for (int i = 0; i < a.length; i++) {
					if(a[i]!=Search) {
				System.out.println("elemdent not found");
					
				break;
				
			}
				
			}
	
	}

	}

