package com.kashish.tutorial.java.practise;

class XnUsingRecursion {

	
	public static double power(double x, double n) {
		if(n==0) return 1;
	    double xpowernminus1= power(x,n-1);
		
		
		return x * xpowernminus1;
	
			
		}
	
	public static void main(String[] args) {
		
		System.out.println(XnUsingRecursion.power(2,5));
	}

	
}
