package co.in.rays.StringShit;

public class StringTest6 {
	

		public static void main(String[] args){
		
		String s=new String("sterling instiute");
		String s1=new String("");
		String s2=new String("");
		int count =0;
		char ch='t';
			
		for(int i=s.length()-1; i>=0; i--){
			if(count<1){
				
				if(ch!=s.charAt(i)){
					s1=s1+s.charAt(i);
				}
				else{
					s1=s1+'$';
					count++;
				}
			}	
			else{
				s1=s1+s.charAt(i);
			}
		}
		for(int j=s1.length()-1; j>=0; j--){	
			s2=s2+s1.charAt(j);
		}
		System.out.println(s2);
		}

	
}
