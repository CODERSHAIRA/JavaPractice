package com.kashish.tutorial.java.practise;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		int[] arr= {5,2,9,7,8};
		System.out.print("New array after sorting: "+"{");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int n=arr[i];
					arr[i]=arr[j];
					arr[j]=n;
				}
					
			}
			System.out.print(arr[i]);
		
			if(k<arr.length)
				System.out.print(",");
			k++;
		}
		System.out.print("}");
	}

}
