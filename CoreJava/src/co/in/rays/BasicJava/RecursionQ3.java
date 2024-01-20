package co.in.rays.BasicJava;
public class RecursionQ3{

	public static void arrayElement(int i){
	
		int [] arr={1,2,3,4,5,6};
		if(i<arr.length){
		System.out.print(arr[i]+"\t");
	 	arrayElement(i+1);
		}
			
	}
	public static void main(String[] args){
	
	arrayElement(0);
	}

}