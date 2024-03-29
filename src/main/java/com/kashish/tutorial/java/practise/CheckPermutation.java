package com.kashish.tutorial.java.practise;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {

		CheckPermutation cp= new CheckPermutation();
		
		System.out.println(cp.checkPermutation("otp", "pot"));
		
	}

	boolean checkPermutation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		int i=0;
		while(i<c1.length) {
			if(c1[i]!=c2[i]) {
				return false;
			}
			else {
				i++;
			}
		}
		return true;
		
	}
}
