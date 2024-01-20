package in.co.rays.basics;

public class String1 {
	public static void main(String[] args) {
		
	
		String s = new String("Sourabh Mandloi");
		String s1= new String("Shankarlal Mandloi");
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf("u"));
		System.out.println(s.length());
		System.out.println(s.indexOf(s));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.lastIndexOf("o"));
		System.out.println(s.concat(s1));
		System.out.println(s.replaceAll("o", "i"));
		System.out.println(s1.replaceFirst("Sh","Ma"));
		System.out.println(s.startsWith("Sourabh"));
		System.out.println(s1.endsWith("loi"));
		System.out.println(s.substring(8));
	}

}