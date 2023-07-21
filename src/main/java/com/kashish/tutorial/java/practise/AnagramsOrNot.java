package com.kashish.tutorial.java.practise;

import java.util.Arrays;

public class AnagramsOrNot {

	public static void main(String[] args) {

		String a="aBcd";
		String b="bCad";
		
		if(a.length()!=b.length()) {
			System.out.println("Strings are not anagrams");
		}
		else {
			a=a.toLowerCase();
			b=b.toLowerCase();
			char[] a1= a.toCharArray();
			char[] b1= b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			int i=0;
			while(i<a1.length) {
				if(a1[i]==b1[i]) {
					i++;
				}
				else {
					System.out.println("Strings are not anagrams");
					break;
				}
			}
			if(i==a1.length) {
				System.out.println("Strings are anagrams");
			}
			
			
		}
		
	}

}








        