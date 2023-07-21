package com.kashish.tutorial.java.practise;

public class CheckOneEditOrZeroEdit {

	public static void main(String[] args) {

		System.out.println(CheckOneEditOrZeroEdit.checkOneEditOrZeroEdit("pale","bple"));
	}

	public static boolean checkOneEditOrZeroEdit(String s1,String s2) {
		int i=0;
		int j=0;
		int k=0;
		int x=0;
		int n=0;
		int h=0;
		if(s1.length()>s2.length()) {
			if((s1.length()-s2.length())==1) {
				while(k<s1.length() && x<s2.length()) {
					if(s1.charAt(k)==s2.charAt(x)) {
						x++;
					}
					k++;
				}
				if(x==s2.length()) {
					return true;
				}
				else return false;
			}
			else{
				return false;
				}
		}
		else if(s2.length()>s1.length()) {
			if((s2.length()-s1.length())==1) {
				while(n<s2.length() && h<s1.length()) {
					if(s2.charAt(n)==s1.charAt(h)) {
						h++;
					}
					n++;
				}
				if(h==s1.length()) {
					return true;
				}
				else return false;
			}
			else{
				return false;
				}
		}
		
		else {
			if(s1.equals(s2)) {
				return true;
			}
			else {
				while(i<s1.length()) {
					if(s1.charAt(i)!=s2.charAt(i)) {
						j++;
					}
					i++;
				}
				if(j==1) return true;
				else return false;
			}
		}
		}
		
	}

