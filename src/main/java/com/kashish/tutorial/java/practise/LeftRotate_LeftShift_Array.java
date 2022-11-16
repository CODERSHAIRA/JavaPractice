package com.kashish.tutorial.java.practise;

public class LeftRotate_LeftShift_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,8};
		System.out.print("Initially: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		int n=arr[0];
		System.out.print("After left rotate: ");
		for(int i=1; i<arr.length; i++) {
			
			arr[i-1]=arr[i];
			
			System.out.print(arr[i]+" ");
		}
		arr[arr.length-1]=n;
		System.out.print(arr[arr.length-1]);
	}

}
