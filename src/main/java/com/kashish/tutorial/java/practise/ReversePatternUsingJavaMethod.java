package com.kashish.tutorial.java.practise;

public class ReversePatternUsingJavaMethod {
	static void pattern(int n) {
		for(int i=0; i<=n; i++) {
			for (int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(5);
	}

}
