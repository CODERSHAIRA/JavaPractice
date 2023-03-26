package com.kashish.tutorial.java.practise;

public class CountOddNumbersInAnIntervalRange {
	
	    public int countOdds(int low, int high) {
	        int j=0;
	        if(low%2==0 && high%2==0){
	            j=(high-low)/2;
	        }
	        else{
	            j=(high-low)/2+1;
	        }

	        
	        /*
	        for(int i=low; i<=high; i++){
	            if(i%2!=0){
	               j++;
	            }
	        }
	        return j;
	*/
	      return j;
	    }
	}





