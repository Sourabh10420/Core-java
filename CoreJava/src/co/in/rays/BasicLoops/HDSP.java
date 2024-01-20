package co.in.rays.BasicLoops;
public class HDSP{

public static void main(String[] args){
int n=0;
for(int i=1; i<=10; i++){
	for(int j=1; j<=10; j++){
	if(i<=5){
		if(j<=6-i||j>=5+i){
		System.out.print(" *");
		}
		else{
		System.out.print("  ");
		}
	}	
	else{
		 n++;
		 
		if(j<=n||j>=11-n){
		System.out.print(" *");
		}
		else{
		System.out.print("  ");
		
		}

	}	
	}
System.out.println();
}

}

}