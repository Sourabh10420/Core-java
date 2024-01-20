package co.in.rays.StringShit;

public class StringTest5 {

		public static void main(String [] args){
		
		String str = new String("sterling institute");
		String str1 =new String("");
		char ch='g';
		int count=0;
		for(int i=0; i<str.length(); i++){
		
			if(count<1){
				if(ch!=str.charAt(i)){
					str1=str1+str.charAt(i);
				}
				else{
					str1=str1+'*';
					count++;
				}
			}
			else{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
		}	
		
	
}
