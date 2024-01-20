package co.in.rays.BasicJava;
public class Question29{

	public static void main(String[] args){

	String s="the quick brown fox jumps over a lazy dog ";
	
	String s1="";
	
	int count=0;
	char ch;
	for(int i=0; i<s.length(); i++){
	
		if(s.charAt(i)!=' '){
			s1=s1+s.charAt(i);
			count++;
		}
		else{
			count++;
			s1=s1+s.charAt(i);
			ch=s1.charAt(s1.length()-2);
			System.out.println(ch);
			count=0;
			s1="";
		}
		
	}
	
	}
	
}