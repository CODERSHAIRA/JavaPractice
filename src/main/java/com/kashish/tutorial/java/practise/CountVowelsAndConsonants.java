package com.kashish.tutorial.java.practise;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String s="fher 233j4@/ *#28POlvai";
		int v=0;
		int c=0;
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U') {
				v++;
			}
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z' )) {
				if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U') {
				
					c++;
				}
				
			}
			i++;
		} 
		System.out.println("The number of vowels present in the string are: "+ v);
		System.out.println("The number of constant present in the string are: "+ c);
		
	}

}
