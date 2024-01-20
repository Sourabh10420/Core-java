package co.in.rays.StringBuffer;

public class BufferTest6 {
	

		public static void main(String[] args){
		
		String s1= new String("The quick brown fox jumps over the lazy dog.");
		String s2=new String(""); 
		String s3=new String(""); 	
			
			for(int i=0; i<s1.length(); i++){
				
				if(s1.charAt(i)!=' '){
				
					s2=s2+s1.charAt(i);
				}
				else{
					s3=s2;
					s2=new String(""); 
				System.out.print(s3+" ");
				}
			}
		}

	}
	