package co.in.rays.ForLoop;

public class MirrorImage{

public static void main(String[] args){

int i,j;

for(i=1; i<=5; i++){
	for(j=5; j>=1; j--){
		if(i==1&&j==5&&j==1||i==5){
		System.out.print("*");
		}
		else{
		System.out.print(" ");
		}
	
	}
System.out.println();
}
}

}