package co.in.rays.StringPractice;

public class String7{
	public static void main(String[] args){
		String str="soos";		
		int count=0,l=0;
		int k=str.length()-1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(count)!=str.charAt(k)){
				l++;}
				count++;
				k--;
			}
		if(l>0){
		System.out.print("String is not palindrome");
		}
		else
		System.out.println("String is palindrome");	
	}
}
