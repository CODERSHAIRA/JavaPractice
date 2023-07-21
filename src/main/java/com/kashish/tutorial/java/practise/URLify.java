package com.kashish.tutorial.java.practise;

public class URLify {

	public static void main(String[] args) {

		String s= "Mr John Smith    ";
		char[] arr = new char[s.length()];
		
		int i=0;
		int j=0;
		while(i<s.length()) {
			if(s.charAt(j)!=' '){
				arr[i]=s.charAt(j);
				j++;
			}
			else {
				arr[i]='%';
				i++;
				arr[i]='2';
				i++;
				arr[i]='0';
				j++;
			}
			i++;
		}
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]);
		}
		
	}

}
