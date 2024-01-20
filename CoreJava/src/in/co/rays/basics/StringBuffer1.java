package in.co.rays.basics;

public class StringBuffer1 {
	public static void main(String[] args) {
		
	StringBuffer sb = new StringBuffer("Sourabh Gujar");
	StringBuffer sb1 = new StringBuffer("Pooja Gurjar");
		System.out.println(sb.capacity());
		System.out.println(sb.append(sb1));
		System.out.println(sb1.codePointBefore(1));
		System.out.println(sb.replace(0, 4, "Sujal"));
		System.out.println(sb1.reverse());
		System.out.println(sb.codePointAt(5));
		System.out.println(sb1.compareTo(sb));
	}
	
}
