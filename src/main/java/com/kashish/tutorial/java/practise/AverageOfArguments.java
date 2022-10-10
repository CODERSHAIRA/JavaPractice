package com.kashish.tutorial.java.practise;


public class AverageOfArguments {
	static int average(int...arr){
		int sum=0;
		
		for(int e: arr) {
			sum+=e;
			
		}
		return sum/arr.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=average(1,2,3,4,5,6);
System.out.print(c);
	}

}
