package co.in.rays.StringShit;

public class StringOccurCh {

		public static void main(String[] args){

		String s="sterling institute";
		char ch='i';
		int length=s.length();
		int j=1;
		for(int i=0; i<length; i++){

			if(s.charAt(i)==ch){
			System.out.println(j+" occurrence of a given character"+ch+"is ="+i);
			j++;
			} 
		}
		}

		
}
