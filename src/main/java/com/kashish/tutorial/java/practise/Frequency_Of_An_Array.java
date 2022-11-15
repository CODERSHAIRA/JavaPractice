package com.kashish.tutorial.java.practise;

public class Frequency_Of_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= new int[]{1,3,2,3,4,5,5};
    for(int i=0; i<arr.length; i++) {
    	 int count =1;
    	for(int j=0; j<arr.length; j++) {
    		if(arr[i]==arr[j] && j!=i) 
    			count++;
    		
    			
    			
    	}
    	System.out.println("Frequency of "+ arr[i]+ "=" + count);
    	}
    	}

	
    }
    
	


