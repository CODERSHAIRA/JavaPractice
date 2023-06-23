package com.kashish.tutorial.java.practise;

public class UsingRecursion {

	public static double usingRecursion(double x,double n) {
		
		if(n==0) return 1;
		double pow= Math.pow(x,n-1);
		return x*pow;
	
			
		}
	public static void main(String[] args) {

		System.out.println(UsingRecursion.usingRecursion(2,10));
	}

}
