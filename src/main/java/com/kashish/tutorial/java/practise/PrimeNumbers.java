package com.kashish.tutorial.java.practise;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=2; i<20 ; i++) {
	boolean isPrime=true;
	
	for(int j=2; j<i; j++) {
		if(i%j==0) {
			isPrime=false;
			break;
		
		}
	}
	
	if(isPrime) {
	System.out.println(i + " is prime number");
	}
}
	}

}
