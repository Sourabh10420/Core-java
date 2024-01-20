package co.in.rays.StringShit;

public class StringTest4 {
	public static void main(String[] args){
		
		String s1="sterling institute";
		String s2="";
		int length=s1.length();
		
		for(int i=0; i<length; i++){
		
			for(int j=0; j<length; j++){
			
				if(s1.charAt(i)!=s1.charAt(j)){
				
					s2=s2+s1.charAt(i);
				}
			}
		}
		System.out.println(s2);
		}

	}

