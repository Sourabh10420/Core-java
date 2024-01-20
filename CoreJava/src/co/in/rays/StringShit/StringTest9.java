package co.in.rays.StringShit;

public class StringTest9 {

		public static void main(String[] args){

		String s="sourabh mandloi s/o shankarlal mandloi ";
		
		String s1="";
		
		int count=0;
		char ch;
		for(int i=0; i<s.length(); i++){
		
			if(s.charAt(i)!=' '){
				s1=s1+s.charAt(i);
				count++;
			}
			else{
				count++;
				//s1=s1+s.charAt(i);
				ch=s1.charAt(s1.length()-1);
				System.out.print(ch+" ");
				count=0;
				s1="";
			}
			
		}
		
		}
		
	}


