package co.in.rays.StringShit;

public class StringCharSwap {
	public static void main(String [] args){

		String s1,s2;
		s1="PRAVESH";
		s2="";

		int length=s1.length();

		for(int i=length-1; i>=0; i--){

		s2=s2+s1.charAt(i);
		System.out.println(s2);
		}
		}

		}

