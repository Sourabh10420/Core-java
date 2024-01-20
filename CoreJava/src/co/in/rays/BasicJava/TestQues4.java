package co.in.rays.BasicJava;
public class TestQues4{

	public static void main(String[] args){
	
	String s1= "sterling123institute";
	String s2="";
	String s3="";
	int length=s1.length();
	
	for(int i=0; i<length; i++){
		if(s1.charAt(i)>=65&&s1.charAt(i)<=122){
			s2=s2+s1.charAt(i);
		}
		else{
			s3=s3+s1.charAt(i);
		}
	
	}
	System.out.println(s2);
	System.out.println(s3);
	}

}