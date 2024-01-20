public class CommandS{
	public static void main(String[] args){
		String str="Sourabh Mandloi";
		int freq=0;
		char ch = 'S';
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