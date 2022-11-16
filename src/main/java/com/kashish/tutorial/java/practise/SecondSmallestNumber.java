package com.kashish.tutorial.java.practise;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {3,4,1,9};
     for(int i=0; i<arr.length; i++) {
    	 for(int j=i+1; j<arr.length; j++) {
    		 if(arr[i]>arr[j]) {
    		 int n=arr[i];
    		 arr[i]=arr[j];
    		 arr[j]=n;
    		 }
    		
    	 }
    	
     }
     System.out.println(arr[0]+" is the smallest element of an array.");
     System.out.println(arr[1]+" is the second smallest element of an array.");
     }
	}


