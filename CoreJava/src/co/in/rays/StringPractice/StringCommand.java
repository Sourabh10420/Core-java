package co.in.rays.StringPractice;

public class StringCommand {

		public static void main(String[] args){
			String str="Pravesh soni";
			int freq=0;
			char ch = 'P';
				for(int i=0;i<str.length();i++){
					int count=0;
					
					for(int j=0;j<str.length();j++){
						if(str.charAt(i)==str.charAt(j)){
						count++;
						}
					}
					if(count>freq){
						freq=count;
						ch=str.charAt(i);	
									
					}
				}
				System.out.println(freq);
				System.out.println(ch);	
			}
	}

