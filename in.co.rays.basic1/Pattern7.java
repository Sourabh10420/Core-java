public class Pattern7{
	public static void main(String[] args){
		
		for(int i=1;i<=9;i++){
		char ch='A';
			for(int j=1;j<=9;j++){
				if(j==10-i || j==i||j==5||i==5){
				System.out.print(ch);
				ch++;
				}
				else{
				System.out.print(" ");
				ch++;
				}
			}
		System.out.println();
		}
	}	
}