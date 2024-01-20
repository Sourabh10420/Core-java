package in.co.rays.basics;

public class NestedForLoop4 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=-1*i+5 ; j++) {
				System.out.print("*");
			}
			System.out.println(i);
		}
	}
}
