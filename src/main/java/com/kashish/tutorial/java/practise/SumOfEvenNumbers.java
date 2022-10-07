package com.kashish.tutorial.java.practise;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
	
		int sum=0;
while(num<5) {
	if(num%2==0) {
	sum=sum+num;
	num++;
	}

}
System.out.print(sum);
	}

}
