package co.in.rays.BasicJava;
public class RemoveFirstOccurrence{

	public static void main(String[] args){
	
	String s1="java";
	int length=s1.length();
	int ch=' ';
		for(int i=0; i<length; i++){
			for(int j=0; j<length; j++){
				if(s1.charAt(i)==s1.charAt(j)){
				ch = s1.charAt(i);
				
				break;
				}
			}
		}
	System.out.print(s1.replace('j', ' '));
	}

} 