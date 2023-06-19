package com.kashish.tutorial.java.practise;

public class ContainsVowelOrNot {

	public static void main(String[] args) {

//			char[] vowel= {'a','e','i','o','u'};
//			String s="mnbva";
//			int a=0;
//			int b=0;
//			
//			for(int i=0; i<s.length(); i++) {
//				for(int j=0; j<vowel.length; j++) {
//					if(s.charAt(i)==vowel[j]) {
//						System.out.print("It contains the vowel.");
//						a++;
//						break;
//					}
//					if(s.charAt(i)!=vowel[j] && i==s.length()-1 && j==vowel.length-1) {
//						System.out.print("It does not contains the vowel.");
//						b++;
//						break;
//					}
//					
//				}
//				if(a>0 || b>0) {
//					break;
//				}
//				
//			}
//			
		

				System.out.println(stringContainsVowels("Hello")); // true
				System.out.println(stringContainsVowels("TV")); // false
			}

			public static boolean stringContainsVowels(String input) {
				return input.toLowerCase().matches(".*[aeiou].*");
			}

}
