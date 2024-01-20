package co.in.rays.BasicJava;
public class SwapToNumber1{
public static void main(String[] args){

int  a,b;
	a=44;
	b=26;
System.out.println("Before swaping : ");
System.out.print("a = ");
System.out.println(a);
System.out.print("b = ");
System.out.println(b);
	b=a+b;
	a=b-a;
	b=b-a;
System.out.println("After swaping : ");
System.out.print("a = ");
System.out.println(a);
System.out.print("b = ");
System.out.println(b);
}
}