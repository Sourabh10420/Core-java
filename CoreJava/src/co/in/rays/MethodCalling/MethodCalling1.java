package co.in.rays.MethodCalling;

public class MethodCalling1 {
	public static int add(int a,int b) {
	 int sum = a+b;
	 return sum;
	}
	public static void main(String[] args) {
		System.out.println("Rays of main method");
		int i = add(30,45);
		System.out.println(i);
		System.out.println("ending of main method");
	}
}
