package co.in.rays.StringShit;

public class PalindromString {
	public static void main(String [] args){

		String s1="radar";
		String s2="";

		int length=s1.length();
		System.out.println("Length"+"\t"+length);

		for(int i= length-1; i>=0; i--){

		s2=s2+ s1.charAt(i);
		}

		if(s1.equalsIgnoreCase(s2)){
		System.out.println("Given String is a palindrome");
		}
		else{
		System.out.println("Given String is not a palindrome");
		}
		}

		}

