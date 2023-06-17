package com.kashish.tutorial.java.practise;

public class SwapTwoVariables {

	public static void main(String[] args) {

		int a=1;
		int b=4;
		System.out.println("a is: "+ a +","+"b is: "+ b);
		
		b=b+a;
		a=b-a;//a=b
		b=b-a;//both swapped
		System.out.println("After Swapping");
		System.out.println("a is: "+ a +","+"b is: "+ b);
		
		
		
	}

}
