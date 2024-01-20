package co.in.rays.StringPractice;

public class StringTest1 {
	

		public static void main(String[] args){
		
		String s1=new String("Java is a PROgramming Language");
		
			for(int i=0; i<s1.length(); i++){
			
				if(s1.charAt(i)>=97 && s1.charAt(i)<=122){
				System.out.print("*");
				}
				else{
				System.out.print(s1.charAt(i));
				}
			}
		
		}	
	
}
