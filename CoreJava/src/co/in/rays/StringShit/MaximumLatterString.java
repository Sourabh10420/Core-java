package co.in.rays.StringShit;

public class MaximumLatterString {
	public static void main(String[] args){
		String s=new String("institute");
		char ch='A';
		int length=s.length();	
		int i,j,maximum=0;
			for(i=0; i<length; i++){
			int count=0;
				for(j=0; j<length; j++){
				
					if(s.charAt(i)==s.charAt(j)){
					count++;
					}
				}
				if(count>=maximum){
				maximum=count;
				ch=s.charAt(i);
					
				}
			}
		System.out.println(maximum);
		System.out.println("Maximum occurrence of character "+ch+" is = "+maximum);
		
		}

	}


