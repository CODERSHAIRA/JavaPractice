package com.kashish.tutorial.java.practise;

public class RemoveSpaces {

	public static void main(String[] args) {

	String s="I am an OMNIFIC ARCANE";
	
	char[] c= new char[s.length()];
	int i=0;
	int a=0;
	while(a<s.length()) {
		
		if(s.charAt(a)==' ') {
		a++;
		}
		c[i]=s.charAt(a);
		a++;
		i++;
	}
	for(int j=0; j<s.length(); j++) {
		System.out.print(c[j]);
	}
	}
}
