package com.kashish.tutorial.java.practise;

public class ToggleTheStringCharacters {

	public static void main(String[] args) {

		String s="abCdEF";
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}
			else {
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
		}
		String toggledString=sb.toString();
		System.out.println(toggledString);
	}

}
