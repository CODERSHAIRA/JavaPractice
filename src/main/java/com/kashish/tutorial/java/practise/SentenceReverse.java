package com.kashish.tutorial.java.practise;

public class SentenceReverse {

	public static void main(String[] args) {
		String sentence= "Hey OMNIFIC ARCANE";
		char[] str=new char[sentence.length()];
		for(int i=0; i<sentence.length(); i++) {
			str[sentence.length()-1-i]=sentence.charAt(i);
		}
		for(int i=0; i<sentence.length(); i++) {
			System.out.print(str[i]);
		}

	}

}
