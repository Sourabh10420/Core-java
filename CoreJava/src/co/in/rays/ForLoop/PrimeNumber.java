package co.in.rays.ForLoop;

public class PrimeNumber{

public static void main(String[] args){

int number=37;
int flag=0;

if(number==0||number==1){
System.out.println("given Number "+number+" is not prime number");
}
else{
	for(int i=2; i<number; i++){
		if(number%i==0){
		System.out.println("given Number "+number+" is not prime number");
		flag=1;
		break;
		}
	
	}
}
if(flag==0){
System.out.println("given Number "+number+" is a prime number");
}
}

}