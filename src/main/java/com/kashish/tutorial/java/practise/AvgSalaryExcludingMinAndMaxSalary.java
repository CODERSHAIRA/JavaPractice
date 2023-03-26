package com.kashish.tutorial.java.practise;

public class AvgSalaryExcludingMinAndMaxSalary {
	
	    public double average(int[] salary) {
	        
	        double max=salary[0];
	        double min=salary[0];
	        double sum=0;
	        for(int i=1; i<salary.length; i++){
	            if(salary[i]>max){
	                max=salary[i];
	            }
	        }
	        for(int i=1; i<salary.length; i++){
	            if(salary[i]<min){
	                min=salary[i];
	            }
	        }
	        for(int i=0; i<salary.length; i++){
	           sum=sum+salary[i];
	        }
	        return (sum-(max+min))/(salary.length-2);
	    }
	}


