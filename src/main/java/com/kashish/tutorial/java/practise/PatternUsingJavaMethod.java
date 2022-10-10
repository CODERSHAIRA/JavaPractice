package com.kashish.tutorial.java.practise;

public class PatternUsingJavaMethod {

	static void pattern(int n) {
		for(int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
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
