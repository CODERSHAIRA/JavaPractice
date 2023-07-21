package com.kashish.tutorial.java.practise;

public class StringCompression {

	public static void main(String[] args) {

		String s="aabcccccaaa";
		int i=1;
		StringBuffer sb= new StringBuffer();
		while(i<s.length()) {
			int x=1;
			while(i<s.length() && s.charAt(i-1)==s.charAt(i)) {
				x++;
				i++;
			}
			sb.append(s.charAt(i-1)).append(x);
			
			i++;
		}
		System.out.print(sb);
	}

}
