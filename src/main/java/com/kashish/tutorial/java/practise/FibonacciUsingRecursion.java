package com.kashish.tutorial.java.practise;

public class FibonacciUsingRecursion {

	public static void printFibonacciSequence(int n) {
	
			int a=0;
			int b=1;
			int c=1;
			for(int i=0; i<=n; i++) {
				System.out.print(a);
				if(i<n) {
					System.out.print(",");
				}
				a=b;
				b=c;
				c=a+b;
			}
		}

	public static void main(String[] args) {

		printFibonacciSequence(10);
	}

}
