package co.in.rays.BasicJava;
public class TestQues3{

	public static void main(String[] args){
	
	String s1 = new String("fear leads to anger anger leads to hatred ");	
	String s2 = "";
	char ch=' ';
	int length = s1.length();
	String s3="";
	String s4="";
		for(int i=0; i<length; i++){
			
			if(ch==s1.charAt(i)){
				s3=s2;
				s2="";	
				
			
			}
			else{
			s2=s2+s1.charAt(i);
			}
		}
	System.out.println(s3);
	}

}