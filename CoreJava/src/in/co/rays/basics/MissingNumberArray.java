package in.co.rays.basics;

public class MissingNumberArray {
	public static void main(String[] args) {
		int[]arr= {1,2,4,3,5,6,86};
		int[]arr1= {1,2,4,3,5,6};
		int sum=0;
		int sum1=0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum+arr[i];
			}
			for (int j = 0; j < arr1.length; j++) {
				sum1= sum1+arr1[j];
			}
		System.out.println(sum-sum1);
	}
}
