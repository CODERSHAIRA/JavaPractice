package com.kashish.tutorial.java.practise;

public class PalindromeOrNot {

	public static void main(String[] args) {

		String s="2qQ, rty trQQ#2";
		int i=0;
		int j=0;
		char[] ch= new char[s.length()];
		while(j<s.length()) {
			if((s.charAt(j)>=0 && s.charAt(j)<=9) || (s.charAt(j)>='a' && s.charAt(j)<='z')){
			ch[i]=s.charAt(j);
			i++;
			j++;
			}
			else if((s.charAt(j)>='A' && s.charAt(j)<='Z')){
				ch[i]=Character.toLowerCase(s.charAt(j));
				i++;
				j++;
				}
			else {
				j++;
			}
		}
		int a1=0;
		int b1=i-1;
		
		while(a1<b1) {
			if(ch[a1]==ch[b1]) {
				a1++;
				b1--;
			}
			else break;
		}
		Boolean isPalindrome= true;
		if(a1>=b1) {
			System.out.print(isPalindrome);
		}
		else {
			System.out.print(!isPalindrome);
		}
	}

}
