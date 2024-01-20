package co.in.rays.NestedIfELse;
public class LargestNumberAmongThreeNumber{
public static void main(String[] args){

int a=1;
int b=0;
int c=10;

if(a>=b){
	if(a==b){
		if(a>=c){
			if(a==c){
				System.out.println("The givin Three Number is equal");
			}
			else{
			System.out.println("The largest number is a and b and the Numbers Are equal");
			}
		}
		else{
			System.out.println("The largest number is c  and  a or b  Are equal");
		}
	          
	}
	else if(a>=c){
			if(a==c){
			System.out.println("The largest number is a and c and the Numbers Are equal");
			}
			else{
			System.out.println("The largest Number is a");
			}
	}
	else{
	System.out.println("The largest Number is c");
	}
	
}
else if(b>=c){
	if(b==c){
	System.out.println("The largest NUmber is b and c and both b and c are equal");
	}
	else{
	System.out.println("The largest Number is b");
	}	
}
else{
	System.out.println("The largest Number is c");
}
}
}