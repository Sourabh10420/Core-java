package co.in.rays.ArrayShit1;

public class SumElementInArray {

	public static void main(String [] args){
		int total=sumOfElements(0);
		System.out.println(total);
		}
		static int sum=0;
		public static int sumOfElements(int a){
		int [] arr={10,20,30,40,50,60,70,80,90,100};
		if(a<arr.length){
			sum=sum+arr[a];
			a++;
			sumOfElements(a);
		}
		return sum;
		}
	}

