package com.kashish.tutorial.java.practise;
public class NthFibonacci {

	public static void main(String[] args) {

		int n=20;
		int a=0;
		int b=1;
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			int c=a+b;
			System.out.print(c + " ");
			arr[i]=c;
			a=b;
			b=c;
		}
		System.out.print("\n");
		System.out.print(arr[9]);
		
	}

}
