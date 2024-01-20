package co.in.rays.BasicJava;
public class TestQues1{

	public static void main(String[] args){
		
	String s1 = new String("the quick brown fox jumps over a lazy dog");
	char ch='a';
	int count=1;
	
	int length=s1.length();
	
		for(int i=0; i<length; i++){
			if(ch==s1.charAt(i)){
				count++;
			}
		}
	System.out.println(count);
	}

}