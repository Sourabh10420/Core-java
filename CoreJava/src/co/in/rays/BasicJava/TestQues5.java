package co.in.rays.BasicJava;
public class TestQues5{

	public static void main(String [] args){
		
	String s1=new String("Sterling institute & programming senter");
	String s2="";
	char ch=' ';
	int length=s1.length();
	for(int i=0; i<length; i++){
	
		if(ch!=s1.charAt(i)){
		s2=s2+s1.charAt(i);
		}
	
	}
	System.out.println(s2);	
	}

}