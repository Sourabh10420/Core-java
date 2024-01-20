package co.in.rays.BasicJava;
public class RecursionQ5{

	public static void main(String[] args){
	
	arrayElement(0);
	}
	public static void arrayElement(int n){
		int [] arr={1,2,3,4,5,6,7,8};
		if(n<arr.length){
		System.out.println("Element in index "+n+" is : "+arr[n]);
		n++;
		arrayElement(n);
		}
	
	}
}