package com.kashish.tutorial.java.practise;

public class IsUnique {

	public static void main(String[] args) {

		IsUnique iu= new IsUnique();
		
		System.out.println(iu.isUniqueChars("asdfs"));
	}
	boolean isUniqueChars(String s) {
		boolean[] char_set= new boolean[128];
		for(int i=0; i<s.length(); i++) {
			int val= s.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val]=true;
		}
		
		return true;
		
	}

}
