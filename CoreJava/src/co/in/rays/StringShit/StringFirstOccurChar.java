package co.in.rays.StringShit;

public class StringFirstOccurChar {
	public static void main(String[] args){

		String s1= "sterling institute";
		char ch='i';
		int length=s1.length();
		int j=1;
		for( int i=0; i<=length-1; i++){

			if(s1.charAt(i)==ch){
			System.out.println(j+" "+"occurrence of "+ch+"  "+i);
			j++;
			break;
			}

		}

		}
		
}


