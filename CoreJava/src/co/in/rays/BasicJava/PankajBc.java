package co.in.rays.BasicJava;
public class PankajBc{

	public static void main(String[] args){
	
	char ch='A';
	
		for(int i=1; i<=5; i++){
			
			for(int j=1; j<=11; j++){
			
				if(j>=6-i&&j<=6+i){
				System.out.print(ch);
				}else if(j==6){
				System.out.print(" ");
				}else{
				System.out.print(" ");
				}
			}
		ch++;
		System.out.println();
		}
	}

}