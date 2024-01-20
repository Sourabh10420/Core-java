package co.in.rays.StringShit;

public class RemoveFirstOccurness {
	public static void main(String[] args){
		
		String s=new String("raman");
		char ch='a';
		int length=s.length();
		int i,j;
			for(i=0; i<length; i++){
				if(ch==s.charAt(i)){
					for(j=0; j<length-1; j++){
					System.out.println(ch);
					}
				}
			}
		}

	}

