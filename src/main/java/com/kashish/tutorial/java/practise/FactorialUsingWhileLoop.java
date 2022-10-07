package com.kashish.tutorial.java.practise;

public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1;
int num=5;
while(num!=0) {
	fact=fact*num;
	num--;
}
System.out.print(fact);
	}

}
