package co.in.rays.ForLoop;

public class PrimeNumber1To100{

	public static void main(String[] args){
	int flag=0;

		for(int i=1; i<=100; i++){
			for(int j=1; j<=i; j++){
				if(i==1){
				//System.out.println(i+"is not prime number");
				flag=1;
				}
				else{
					if(i%j==0){
					//System.out.println(i+"is not prime number");
					flag=1;
					
					}
				}
		
			}
			if(flag==0){
			System.out.println(i+"is a prime number");
			}
		}

	}
}

