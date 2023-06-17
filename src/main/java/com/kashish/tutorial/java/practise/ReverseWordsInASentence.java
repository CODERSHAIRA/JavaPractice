package com.kashish.tutorial.java.practise;

public class ReverseWordsInASentence {

	public static void main(String[] args) {


		String s="Omnific Arcane";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				int j=i-1;
				while((j!=-1) && (s.charAt(j)!=' ')) {
					System.out.print(s.charAt(j));
					j--;
				}
				System.out.print(" ");
			}
			if(i==s.length()-1) {
				int j=i;
				while((j!=-1) && (s.charAt(j)!=' ')) {
					System.out.print(s.charAt(j));
					j--;
				}
			}
		}
	}

}
