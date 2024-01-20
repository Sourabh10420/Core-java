package co.in.rays.StringShit;

public class StringTest1 {

public static void main(String [] args){
		
		String s1 = new String("instituten");
		String s2="rays";
		char ch =s1.charAt(1);
		int count=0;
		int length = s1.length();
			
			for(int i=0; i<length; i++){
				if(count<1){
					if(ch!=s1.charAt(i)){
						s2=s2+s1.charAt(i);
					}
					else{
						count++;
					}
				}
				else{
					s2=s2+s1.charAt(i);
				}
			}
		System.out.println(s2);
		}	


	}

