package com.kashish.tutorial.java.practise;

public class FibonacciSeriesUsingRecursion {

	static int fibonacci_term(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else {
		
		return fibonacci_term(n-2)+fibonacci_term(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=fibonacci_term(5);
		System.out.print(c);
	}

}
