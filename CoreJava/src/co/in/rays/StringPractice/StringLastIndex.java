package co.in.rays.StringPractice;

public class StringLastIndex {
		public static void main(String[] args){
			String str="Java is a programming language and it is easy to use";
			int count=0,freq=0;
					for(int i=0;i<str.length();i++){
						if('y'==str.charAt(i)){
						count++;
						}
					}
					for(int i=0;i<str.length();i++){
						if(freq<=count-1){
						freq++;
							if(freq==count-1){
							System.out.println(i);
							}
					}
					}
		}
	}

