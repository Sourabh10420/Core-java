package co.in.rays.StringShit;

public class OccurrnessChar {
	public static void main(String [] args){

		String s=new String("sterling institude");
		int length=s.length();

		for(int i=0; i<=length-1; i++){
		int count=0;
			for(int j=0; j<length; j++){
			if(s.charAt(i)==s.charAt(j)){
			count++;
			}
			}
		System.out.println(s.charAt(i)+" is occurrence ="+ count);
		}
		}

		
}
