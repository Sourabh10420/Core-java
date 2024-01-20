package co.in.rays.NestedWhileLoop;
public class HollowSquareStarPatternWithDiagonal{

public static void main(String[] args){

int i=1;
while(i<=5){
int j=1;
	while(j<=5){
		if(i==1||j==1||j==i||j==5||i==5){
		System.out.print("* ");
		}
		else if(i==4&&j==2||j==4&&i==2){
		System.out.print("* ");
		}
		else{
		System.out.print("  ");
		}
	j++;
	}

System.out.println();	
i++;
}
}

}