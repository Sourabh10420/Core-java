package co.in.rays.StringShit;

public class StringTest2 {

		public static void main(String [] args){
			
		String s1 = new String("institute");
		char ch='t';
		String s2 ="";
		int length = s1.length();	
		int count=0;
			
			for(int i=length-1; i>=0; i--){
				
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
