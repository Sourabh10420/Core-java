package in.co.rays.basics;

public class SwitchStringCase {
	public static void main(String[] args) {
		String s = "week3";
		switch (s) {
		case "week1":
			System.out.println("this is first week");
			
			break;
		case "week2":
			System.out.println("thus is second week");
			break;
		case "week3":
			System.out.println("this is third week");
			break;
		case"week4":
			System.out.println("this is fourth week");
		default:
			System.out.println("this is not a week");
			break;
		}
		
	}

}
