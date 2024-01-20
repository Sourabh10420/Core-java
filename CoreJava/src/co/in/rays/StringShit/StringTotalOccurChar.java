package co.in.rays.StringShit;

public class StringTotalOccurChar {
	
		public static void main(String[] args){

		String s=new String("sterling institude");
		char ch='t';
		int length=s.length();
		int count=0;

		for(int i=0; i<=length-1; i++){
			
			if(s.charAt(i)==ch){
			count++;
			}

		}
		System.out.println("total occurrence of a givin character "+ch+" is= "+count);
		}

		}



