package co.in.rays.MethodCalling;

public class MethodCalling2 {
	public static int methods(int a,int b) {
		 int multiply= a*b;
		 int addition= a+b;
		 int sub=a-b;
		 int divide = (int) ((double) a%b);
		
		return divide;
	}
	public static void main(String[] args) {
		int i= methods(105,20);
		System.out.println(i);
	}

}
