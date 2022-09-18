package com.kashish.tutorial.java.practise;
import java.util.Scanner;

public class AutomorphicNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Let the number is: ");
int number=scanner.nextInt();

int squareOfNumber=number*number;
int num=number;
int count=0;
while(number!=0) {
	number=number/10;
	++count;
	
}
System.out.println("count: "+count);
if(squareOfNumber % (Math.pow(10,count))==num )
	System.out.println("it is an automorphic number");
else
	System.out.println("it is not an automorphic number");
	}

}
