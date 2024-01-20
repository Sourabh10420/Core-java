package co.in.rays.StringShit;

public class LowestOfChar {
	
public static void main(String[] args){
		
		String s=new String("sterling institute");		
		int i,j;
		int length=s.length();
		int minimum=length;
		char ch='t';
			for(i=0; i<length; i++){
			int count=0;
				for(j=0; j<length; j++){
				
					if(s.charAt(i)==s.charAt(j)){
					
					count++;
					}	
				}
				if(count<=minimum){
				minimum=count;
				ch=s.charAt(i);
				}
		
			}
		System.out.println("minimum occurrence of charater "+ch+" is = "+minimum);
		}

	}

