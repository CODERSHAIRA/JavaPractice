package com.kashish.tutorial.java.practise;

public class IsomorphicStrings {
	
	    public boolean isIsomorphic(String s, String t) {
	       
	        char[] a1=new char[s.length()];
	        char[] a2=new char[t.length()];
	        for(int i=0; i<s.length(); i++){
	            a1[i]=s.charAt(i);
	        }
	        for(int i=0; i<t.length(); i++){
	            a2[i]=t.charAt(i);
	        }
	        for(int i=0; i<a1.length; i++){
	            for(int j=i; j<a1.length; j++){
	if((a1[i]==a1[j] && a2[i]!=a2[j]) || (a1[i]!=a1[j] && a2[i]==a2[j])) return false;
	            }
	        }
	       return true;
	    }
	}


