package co.in.rays.ForLoop;

public class PowerOfNumber{

public static void main(String [] args){

int number=9;
int power=1;
for(int i=1; i<=number; i++){
	if(i==number){
		power=i*number;
	}
}
System.out.println("Power Of Given Number is = "+power);
}

}