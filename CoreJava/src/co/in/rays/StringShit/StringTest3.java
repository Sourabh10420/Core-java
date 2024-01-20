package co.in.rays.StringShit;

public class StringTest3 {
	

		public static void main(String [] args){
		
		String s1 = new String("institute");
		String s2 = new String("");
		char ch='t';
		int length=s1.length();
			for(int i=0; i<length; i++){
			
				if(ch!=s1.charAt(i)){
				s2=s2+s1.charAt(i);
				}
			}
		System.out.println(s2); 
		}

	
}
