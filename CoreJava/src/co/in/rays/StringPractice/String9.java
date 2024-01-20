package co.in.rays.StringPractice;
public class String9{
	public static void main(String[] args){
		String str="Java is a programming language and it is easy to learn";
		char k = 'a';
			for(int i=0;i<str.length();i++){
				if(k!=str.charAt(i)){
				System.out.print(str.charAt(i));
				}
				else{
				System.out.print("*");
				}
			}
		System.out.println();
	}
}


