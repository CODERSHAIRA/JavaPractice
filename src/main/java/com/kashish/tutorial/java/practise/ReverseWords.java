package com.kashish.tutorial.java.practise;
public class ReverseWords {

	public static void main(String[] args) {

		String s="I am an Omnific Arcane";
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==' ') {
				int j=i+1;
				while((j!=s.length()) && (s.charAt(j)!=' ') ) {
				System.out.print(s.charAt(j));
				j++;
				}
				System.out.print(" ");
			}
			if(i==0) {
				int j=0;
				while((j!=s.length()) && (s.charAt(j)!=' ')) {
				System.out.print(s.charAt(j));
				j++;
				}
			}
		}
	}

}