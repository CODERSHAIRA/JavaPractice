package com.kashish.tutorial.java.practise;

public class Palindrome {

	public static void main(String[] args) {

		String s="Hasanand";
		int a=0;
		int b=s.length()-1;
		
		
		while(s.charAt(a)==s.charAt(b)) {
			if(s.charAt(a)==s.charAt(b)) {
				a++;
				b--;
				if(a==b) {
					System.out.println("String is a palindrome.");
					break;
				}
			}
		}
		if(a==b) {
			
		}
		else{
			System.out.println("String is not a palindrome.");
		}
	}
	

}
