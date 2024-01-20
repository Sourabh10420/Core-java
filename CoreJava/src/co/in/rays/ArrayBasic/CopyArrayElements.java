package co.in.rays.ArrayBasic;

public class CopyArrayElements {
	public static void main(String[] args) {
		char [] copyfrom = {'a','b','c','d','e','f','g','h'};
		
		char [] copyto = new char[20];
		
			System.arraycopy(copyfrom,3,copyto,0,5);
			System.out.println(copyto);
	}
}

