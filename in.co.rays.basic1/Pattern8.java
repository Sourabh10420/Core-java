public class Pattern8{
	public static void main(String[] args){
		char ch='A';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
				System.out.print(ch);
				ch++;
				}
				else{
				System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}