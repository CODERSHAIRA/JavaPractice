package com.kashish.tutorial.java.practise;

public class CheckOddNumbers {

	public static void main(String[] args) {

		int a=0;
		int[] arr= {1,3,7,5};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				a++;
			}
		}
		if(a==arr.length) {
			System.out.println("It contains only odd numbers");
		}
		else {
			System.out.println("It does not contain only odd numbers");
		}
	}

}
