package com.kashish.tutorial.java.practise;

public class SortAnArray {

	public static void main(String[] args) {

		int[] arr= {8,4,0,-2};
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	}