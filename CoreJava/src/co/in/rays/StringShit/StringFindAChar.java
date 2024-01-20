package co.in.rays.StringShit;

import java.util.Scanner;
public class StringFindAChar {
		
		public static void main(String[] args){
			System.out.println("Enter Index vlaue");
		Scanner sc = new Scanner(System.in);
			int indexValue;
			indexValue=sc.nextInt();
			String s1 = new String("Sourabh is a IT student");
			for(int i=0; i<s1.length(); i++){
			
				if(i==indexValue){
				System.out.println(s1.charAt(i));
				}
			}
			
		}

	
}
