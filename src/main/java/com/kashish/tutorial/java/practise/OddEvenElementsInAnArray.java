package com.kashish.tutorial.java.practise;

public class OddEvenElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,4,7,8,1};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]+" is even");
			else
				System.out.println(arr[i]+" is odd");
		}
	}

}
