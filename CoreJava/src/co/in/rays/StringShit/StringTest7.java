package co.in.rays.StringShit;

public class StringTest7 {
	

		public static void main(String[] args){
		
		String str1=new String("sterling institute");
		String str2=new String("");
		char ch='i';
		
		for(int i=0; i<str1.length(); i++){
		
			if(ch!=str1.charAt(i)){
				str2=str2+str1.charAt(i);
			}
			else{
				str2=str2+'@';
			}
		}
		System.out.println(str2);
		}

	
}
