package com.kashish.tutorial.java.practise;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		  int n=37434;
//        String s=Integer.toString(n);
//        System.out.println(s.length());
		int l=0;		
		while(n!=0) {
			int a=n/10;
			n=a;
			l++;
		}
		System.out.print(l);
	}

}
