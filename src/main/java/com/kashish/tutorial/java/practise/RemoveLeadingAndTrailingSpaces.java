package com.kashish.tutorial.java.practise;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {

	String s=" nhwdwe jrfnr jfjr! ";
	char[] c=new char[s.length()];
	int a=0;
	int b=0;
	while(a<s.length()) {
		if(a==0) {
			a++;
		}
		c[b]=s.charAt(a);
		a++;
		b++;
	}
	for(int i=0; i<s.length(); i++) {
		System.out.print(c[i]);
	}
	}

}
