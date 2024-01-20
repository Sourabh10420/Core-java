package in.co.rays.basics;

public class Maximum1 {
	public static void main(String[] args) {
		int x= 300;
		int y =200;
		int z=x-y;
		for (int i = 0; i<10; i++) {
			int ran= (int)(Math.random()*z);
			System.out.print(ran+",");
		}
	}

}
