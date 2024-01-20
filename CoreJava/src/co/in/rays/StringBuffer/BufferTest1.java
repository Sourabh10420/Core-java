package co.in.rays.StringBuffer;

public class BufferTest1 {

		public static void main(String[] args){
		
			StringBuffer s1=new StringBuffer("SOURABH IS A IT STUDENT");
			int index= Integer.parseInt(args[0]);
			
			for(int i=0; i<s1.length(); i++){
				
				if(i==index){
				System.out.println(s1.codePointAt(i));
				}
			}
		}

	}

