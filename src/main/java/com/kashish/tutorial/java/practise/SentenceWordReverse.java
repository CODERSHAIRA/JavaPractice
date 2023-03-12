package com.kashish.tutorial.java.practise;

public class SentenceWordReverse {

	public static void main(String[] args) {
		String sentence= "Hey OMNIFIC ARCANE";
		char[] str=new char[sentence.length()];
		for(int i=0; i<sentence.length(); i++) {
			str[i]=sentence.charAt(i);
		}
		for(int i=0; i<str.length; i++) {
			if(str[i]==' ') {
				for(int j=i-1; j>=0; j--) {
				    if(str[j]==' ') {
						   break;
					}
				    System.out.print(str[j]);
				
				}
				System.out.print(" ");
				}
			else if(i==str.length-1) {
				for(int j=i; j>=0; j--) {
				    System.out.print(str[j]);
				    if(str[j]==' ') {
					   break;
				}
				}
			}
			
		}

	}

}
