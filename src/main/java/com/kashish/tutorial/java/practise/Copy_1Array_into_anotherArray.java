package com.kashish.tutorial.java.practise;

public class Copy_1Array_into_anotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,4,7};
	
		/*int[] arr1=new int[3];
		arr1[0]=arr[0];
		arr1[1]=arr[1];
		arr1[2]=arr[2];
		for(int e:arr1) {
		System.out.println(e);
		}
		*/
		int[] arr1=new int[arr.length];
		for(int i=0; i<arr.length; i++) {
        arr1[i]=arr[i];
		
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
