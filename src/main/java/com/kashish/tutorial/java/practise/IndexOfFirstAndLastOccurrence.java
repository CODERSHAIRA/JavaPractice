package com.kashish.tutorial.java.practise;
import java.util.*;
public class IndexOfFirstAndLastOccurrence {

	public static void main(String[] args) {

		int[] arr= {2,4,5,7};
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				System.out.println("Index of First occurrence: "+ i);
				System.out.println("Index of Last occurrence: "+ (arr.length-1-i));
				break;
				
			}
			if(arr[i]!=n && i==arr.length-1) {
				System.out.println("Index of First occurrence: "+ -1);
				System.out.println("Index of Last occurrence: "+ -1);
			}
			
		}
	}

}
