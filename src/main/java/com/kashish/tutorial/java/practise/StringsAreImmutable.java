package com.kashish.tutorial.java.practise;

public class StringsAreImmutable {

	public static void main(String[] args) {

		String s1="ggtft";
	    String s2=s1;

		System.out.println("Before Modification");
		System.out.println(s1==s2);
		
		s1+="fgtfg";
		System.out.println("After Modification");
		System.out.println(s1==s2);
	}

}
