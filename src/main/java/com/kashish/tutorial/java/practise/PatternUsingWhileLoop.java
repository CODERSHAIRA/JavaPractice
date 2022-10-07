package com.kashish.tutorial.java.practise;

public class PatternUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
while(i<5) {
	int num=4;
	while((num-i)>0) {
		System.out.print("*");
		--num;
	}
	System.out.print("\n");
	i++;
}
	}

}
