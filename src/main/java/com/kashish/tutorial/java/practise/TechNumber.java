package com.kashish.tutorial.java.practise;
import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int number=scanner.nextInt();
int num=number;

int count=0;

while(number!=0) {
	number=number/10;
	++count;
	
}
int rem=(int) (num %(Math.pow(10,count/2)));
//dividend=divisor*quotient + remainder
int quotient=(int) ((num-rem)/(Math.pow(10, count/2)));
int n= rem+quotient;
int squareOfNumber=n*n;
if(squareOfNumber==num)
	System.out.print("it is a tech number");
else
	System.out.print("it is not a tech number");
	}

}
