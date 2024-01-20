package co.in.rays.BasicJava;
public class IfElseTest{

	public static void main(String[] args){
	
		int number=19;
		
			if(number>0){
				if(number<10){
				System.out.println("Given number is a Singal Digit");
				}
				else if(number<100){
				System.out.println("Given number is a Double Digit");
				}
				else if(number<1000){
				System.out.println("Given number is a Three Digit");
				}
				else{
				System.out.println("Given Number is a Multiple Digit number");
				}
				
			}
			else{
			System.out.println("Given number is a Negative");
			} 
	}
}