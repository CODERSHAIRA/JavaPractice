package com.kashish.tutorial.java.practise;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.print("{");
		for(int i=4; i>=0; i--) {
			System.out.print(arr[i]);
			if(i!=0)
				System.out.print(",");
		}
		System.out.print("}");

	}

}
