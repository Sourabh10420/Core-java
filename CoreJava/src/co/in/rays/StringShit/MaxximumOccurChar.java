package co.in.rays.StringShit;

public class MaxximumOccurChar {

		public static void main(String [] args){

			String s=new String("sterling institude");
			int length=s.length();
			char ch ='a';
			int maximum=0;
			int i,j;
			for( i=0; i<=length-1; i++){
				int count=0;
				for( j=0; j<length; j++){
					if(s.charAt(i)==s.charAt(j)){
						count++;
					}
					else if(count>=maximum){
					maximum=count;
					if(s.charAt(i)==s.charAt(j)){
						System.out.println("maximum occurrence of character"+s.charAt(i)+maximum);
						
					
					}		
					
				}
					
				}
			}
			
		}
	
}
