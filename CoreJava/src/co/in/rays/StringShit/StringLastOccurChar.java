package co.in.rays.StringShit;

public class StringLastOccurChar {
	

		public static void main(String[] args){

		String s1= "sterling institute";
		char ch='e';
		int length=s1.length();

		for( int i=length-1; i>=0; i--){

			if(s1.charAt(i)==ch){
			System.out.println(" last occurrence of "+ch+" is = "+i);
			
			break;
			}

		}

		}
		}

