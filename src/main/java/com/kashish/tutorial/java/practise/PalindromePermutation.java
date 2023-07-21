package com.kashish.tutorial.java.practise;

public class PalindromePermutation {

	public static void main(String[] args) {

		String s ="Tact Cao";
        s=s.toLowerCase();
        int w=0;
        
        char[] arr= s.toCharArray();
        for(int i=0; i<s.length(); i++) {
        	int x=1;
        	 for(int j=0; j<s.length(); j++) {
             	if(arr[i]==arr[j] && i!=j) {
             		x++;
             	}
             }
        	 if(x%2!=0 && arr[i]!=' ') {
        		 w++;
        	 }
        }
        if(w>1) {
        	System.out.println("The word cannot be a palindrome");
        }
        else {
        	System.out.println("The word can be a palindrome");
        }
	}

}
