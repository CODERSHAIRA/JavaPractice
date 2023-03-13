package com.kashish.tutorial.java.practise;

public class PivotIndex {

	    public int pivotIndex(int[] nums) {
	        int[] arr1=new int[nums.length];
	        int[] arr2=new int[nums.length];
	        int sum1=0;
	        int sum2=0;
	        for(int i=0; i<nums.length; i++){
	            sum1=sum1+nums[i];
	            arr1[i]=sum1;
	        }
	        for(int j=nums.length-1; j>=0; j--){
	            sum2=sum2+nums[j];
	            arr2[j]=sum2;
	        }
	        for(int k=0; k<nums.length; k++){
	            for(int m=0; m<nums.length; m++){
	                if(arr2[m]==0 && m==1) return 0;
	                if((arr1[k]==arr2[m] && k+2==m)||(arr1[k]==0 && k==nums.length-2)) return k+1;
	                if(arr1[k]==arr2[m] && k==m && arr1.length==arr2.length && arr1.length==1) return 0;
	        
	        }
	        }
	        return -1;
	    }
	    
	}


