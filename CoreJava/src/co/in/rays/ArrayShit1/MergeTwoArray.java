package co.in.rays.ArrayShit1;
//Q15.Write a program to merge two array to third array.
public class MergeTwoArray {

	public static void main(String[] args){
		int [] p=new int[10];
		int [] r=new int [5];
		int n=3;
		for(int i=0; i<p.length; i++){
		 p[i]=n;
		 n=n*3;
		}
		n=1;
		for(int j=0; j<r.length; j++){
		 r[j]=n;
		 n=n*2;
		}
		System.out.println("First Array");
		for(int a : p){
		System.out.print(a+"\t");
		}
		System.out.println("\nSecond Array");
		for(int b : r){
		System.out.print(b+"\t");
		}
		int []s=new int[p.length+r.length];
		for(int k=0; k<s.length; k++){
			for(int i=0;i<p.length; i++){
				s[k]=p[i];
				k++;	
			}
			for(int j=0; j<r.length; j++){
				s[k]=r[j];
				k++;
			}
		}
		System.out.println("\nThid Array After Merge First and Second Array  ");
		for(int a : s ){
		System.out.print(a+"\t");
		}
		}
	}

