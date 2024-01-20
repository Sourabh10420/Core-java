package co.in.rays.StringShit;

public class StringLenghtDecreass {

		public static void main(String[] args){

		String s1="Sourabh Mandloi";
		String s2 = "";
		System.out.println(s1.length());

		int len=s1.length();

		for(int i=len-1; i>=0; i--){

		s2 = s2 + s1.charAt(i);

		}
		System.out.println(s2);


		}

		}

