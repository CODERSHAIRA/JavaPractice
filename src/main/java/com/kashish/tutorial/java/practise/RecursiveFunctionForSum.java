package com.kashish.tutorial.java.practise;

public class RecursiveFunctionForSum {

	static int sum(int n) {
	if(n==1) {
		return 1;
	}
	return n+sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c=sum(10);
System.out.print(c);
	}

}
