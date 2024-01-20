package co.in.rays.StringBuffer;

public class BufferTets2 {


		public static void main(String[] args){
		
			StringBuffer s=new StringBuffer("HOLKAR SCIENCE COLLEGE IN INDORE");
			int index=Integer.parseInt(args[0]);

			for(int i=0; i<s.length(); i++){
			
				if(i==index){
				System.out.println(s.codePointBefore(i));
				}
			}
			
		}

	
}
