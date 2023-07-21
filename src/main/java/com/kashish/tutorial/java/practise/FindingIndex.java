package com.kashish.tutorial.java.practise;
import java.util.*;
public class FindingIndex {

	public static void main(String[] args) {

		int[] arr= {2,4,6,8};
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		while(i<arr.length) {
			if(n>arr[i]) {
				i++;
			}
			else{
				System.out.println("The index for n should be: "+ i);
				break;
			}
		}
		
	}

}
