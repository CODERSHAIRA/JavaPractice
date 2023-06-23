package com.kashish.tutorial.java.practise;

public class PrintUniqueCharacters {

	public static void main(String[] args) {

		int p=0;
		String s="fghkhiqazf";
		char[] c=new char[s.length()];
		for(int i=0; i<s.length(); i++) {
			int a=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)!=s.charAt(j) && i!=j) {
					a++;
				}
			}
			if(a==s.length()-1) {
				c[p]=s.charAt(i);
				p++;
			}
		}
		for(int b=0; b<s.length(); b++) {
			System.out.print(c[b]);
		}
	}

}
