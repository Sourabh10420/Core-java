package co.in.rays.ForLoop;

public class MirrorImageOfRT{

public static void main(String[] args){

int i,j,k;

for(i=5; i>=1; i--){
	for(j=i; j>=1; j--){
	System.out.print(" ");
	}
	for(k=5; k>=i; k--){
	System.out.print("*");
	}
System.out.println();
}
for(i=1; i<=5; i++){
	for(j=1; j<=i; j++){
	System.out.print(" ");
	}
	for(k=5; k>=i; k--){
	System.out.print("*");
	}
System.out.println();
}

}
}