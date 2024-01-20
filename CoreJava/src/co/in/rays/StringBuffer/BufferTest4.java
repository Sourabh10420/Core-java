package co.in.rays.StringBuffer;

public class BufferTest4 {
	

		public static void main(String [] args){
		
			String s1 = new String("Sourabh Mandloi"); 
			String s2 = new String("Sourabh mandloi"); 
			
			if(s1.compareToIgnoreCase(s2)==0){
			System.out.println("Given Strings are s1 & s2 is a same in lexicographically");
			}
			else{
			System.out.println("Given Strings are s1 & s2 is not same in lexicographically");
			}
		}

	
}
