public class Pattern2{
public static void main(String[] args){
int i,j;
		for(i=1;i<=9;i++){
				for(j=1;j<=9;j++){
					if (i<=5){
						if (j>=i && j<=10-i)
							System.out.print("*");
						}
					if (i>5){
						if(j>=10-i && j<=i)
							System.out.print("*");
						}
					}
						System.out.println();
				}
			}
	}