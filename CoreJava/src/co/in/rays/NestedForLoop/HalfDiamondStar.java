package co.in.rays.NestedForLoop;
public class HalfDiamondStar{

public static void main(String[] args){

int i,j;

for(i=1; i<=5; i++){

	for(j=1; j<=i; j++){
		
		System.out.print("* ");
	
	}
System.out.println();
}
for(i=4; i>=1; i--){

	for(j=1; j<=i; j++){
		
	System.out.print("* ");
	}
System.out.println();
}
//mirror image



}

}