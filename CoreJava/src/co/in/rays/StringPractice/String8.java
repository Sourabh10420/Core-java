package co.in.rays.StringPractice;
import java.util.Scanner;
public class String8{
	public static void main(String[] args){
		String str="Sourabh Mandloi";
		int ch;
		System.out.println("Enter a character");
		Scanner sc=new Scanner(System.in);
		ch= sc.nextInt();
			
			if(65<=ch || ch<=90){
			str=str.toUpperCase();
				for(int i=1;i<str.length();i++){
					if(ch==str.charAt(i)){
					System.out.println(i);
				}	}
			}
			else {
			str=str.toLowerCase();
				for(int i=1;i<str.length();i++){
					if(ch==str.charAt(i)){
					System.out.println(i);
				}	}
			}
	}
}
